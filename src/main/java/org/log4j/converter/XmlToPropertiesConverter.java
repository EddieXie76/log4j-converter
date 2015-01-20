package org.log4j.converter;

import org.apache.commons.collections.CollectionUtils;
import org.log4j.converter.model.*;
import org.log4j.converter.util.JAXBUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class XmlToPropertiesConverter implements Converter {

    public static final String LOG4J = "log4j";
    public static final String DOT = ".";
    public static final String EQUALS = "=";
    public static final String ROOT_LOGGER = "rootLogger";
    public static final String DEFAULT_LEVEL = "ERROR";
    public static final String COMMA = ",";
    public static final String NEW_LINE = "\r\n";
    public static final String APPENDER = "appender";
    public static final String LAYOUT = "layout";
    public static final String LOGGER = "logger";
    public static final String ADDITIVITY = "additivity";

    @Override
    public void convert(InputStream inputStream, OutputStream outputStream) throws IOException {
        Log4JConfiguration log4JConfiguration = JAXBUtils.unmarshal(inputStream, Log4JConfiguration.class);
        StringBuilder sb = new StringBuilder();

        processRootLogger(log4JConfiguration, sb);

        processAppender(log4JConfiguration, sb);

        for (Object categoryOrLogger : log4JConfiguration.getCategoryOrLogger()) {
            if (Logger.class.isInstance(categoryOrLogger)) {
                processLogger((Logger) categoryOrLogger, sb);
                sb.append(NEW_LINE);
            }
        }

        outputStream.write(sb.toString().getBytes());
    }

    private void processLogger(Logger logger, StringBuilder sb) {
        sb.append(LOG4J).append(DOT).append(LOGGER).append(DOT).append(logger.getName()).append(EQUALS).append(logger.getLevel().getValue());
        if (CollectionUtils.isNotEmpty(logger.getAppenderRef())) {
            for (AppenderRef appenderRef : logger.getAppenderRef()) {
                sb.append(COMMA).append(appenderRef.getRef());
            }
        }
        sb.append(NEW_LINE);

        if (Boolean.FALSE.toString().equals(logger.getAdditivity())) {
            sb.append(LOG4J).append(DOT).append(ADDITIVITY).append(DOT).append(logger.getName()).append(EQUALS).append(logger.getAdditivity()).append(NEW_LINE);
        }
    }

    private void processAppender(Log4JConfiguration log4JConfiguration, StringBuilder sb) {
        if (CollectionUtils.isEmpty(log4JConfiguration.getAppender())) {
            return;
        }
        for (Appender appender : log4JConfiguration.getAppender()) {
            sb.append(LOG4J).append(DOT).append(APPENDER).append(DOT).append(appender.getName())
                    .append(EQUALS).append(appender.getClazz()).append(NEW_LINE);
            sb.append(LOG4J).append(DOT).append(APPENDER).append(DOT).append(appender.getName())
                    .append(DOT).append(LAYOUT).append(EQUALS).append(appender.getLayout().getClazz()).append(NEW_LINE);
            for (Param param : appender.getLayout().getParam()) {
                sb.append(LOG4J).append(DOT).append(APPENDER).append(DOT).append(appender.getName())
                        .append(DOT).append(LAYOUT).append(DOT).append(param.getName()).append(EQUALS).append(param.getValue()).append(NEW_LINE);
            }
            for (Param param : appender.getParam()) {
                sb.append(LOG4J).append(DOT).append(APPENDER).append(DOT).append(appender.getName())
                        .append(DOT).append(param.getName()).append(EQUALS).append(param.getValue()).append(NEW_LINE);
            }
            sb.append(NEW_LINE);
        }
    }

    private void processRootLogger(Log4JConfiguration log4JConfiguration, StringBuilder sb) {
        sb.append(LOG4J).append(DOT).append(ROOT_LOGGER).append(EQUALS).append(getLevel(log4JConfiguration));
        if (CollectionUtils.isNotEmpty(log4JConfiguration.getRoot().getAppenderRef())) {
            for (AppenderRef appenderRef : log4JConfiguration.getRoot().getAppenderRef()) {
                sb.append(COMMA).append(appenderRef.getRef());
            }
        }
        sb.append(NEW_LINE).append(NEW_LINE);
    }

    private String getLevel(Log4JConfiguration log4JConfiguration) {
        Root root = log4JConfiguration.getRoot();
        Object obj = root.getPriorityOrLevel().get(0);
        if (Priority.class.isInstance(obj)) {
            return ((Priority) obj).getValue();
        }
        if (Level.class.isInstance(obj)) {
            return ((Level) obj).getValue();
        }
        return DEFAULT_LEVEL;
    }
}
