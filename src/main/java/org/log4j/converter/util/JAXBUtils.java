package org.log4j.converter.util;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchema;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public abstract class JAXBUtils {

    public static void marshal(Object message, Result result) {
        marshal(message, result, new HashMap<String, Object>());
    }

    public static void marshal(Object message, Result result, Map<String, Object> properties) {
        Class<?> msgClass = message.getClass();
        try {
            Marshaller marshaller = JAXBContext.newInstance(message.getClass()).createMarshaller();
            for (Map.Entry<String, Object> entry : properties.entrySet()) {
                marshaller.setProperty(entry.getKey(), entry.getValue());
            }
            if (msgClass.getAnnotation(XmlRootElement.class) != null) {
                marshaller.marshal(message, result);
            } else if (msgClass.getAnnotation(XmlType.class) != null) {
                QName qName = new QName(msgClass.getPackage().getAnnotation(XmlSchema.class).namespace(), msgClass.getSimpleName());
                marshaller.marshal(new JAXBElement(qName, msgClass, message), result);
            }
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> T unmarshal(InputStream inputStream, Class<T> clazz) {
        return unmarshal(new StreamSource(inputStream), clazz);
    }

    public static <T> T unmarshal(Source source, Class<T> clazz) {
        try {
            JAXBContext context = JAXBContext.newInstance(clazz);
            JAXBElement<T> element = context.createUnmarshaller().unmarshal(source, clazz);
            return element.getValue();
        } catch (Exception e) {
            throw new IllegalStateException(e.getMessage());
        }
    }
}
