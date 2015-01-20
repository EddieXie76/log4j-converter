package org.log4j.converter;

import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class XmlToPropertiesConverterTest {

    @Test
    public void convert0() throws IOException {
        InputStream inputStream = getClass().getResourceAsStream("/log4j-0.xml");
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        initConverter().convert(inputStream, outputStream);
        Assert.assertEquals(readFile("/log4j-0.properties"), outputStream.toString());
    }

    @Test
    public void convert1() throws IOException {
        InputStream inputStream = getClass().getResourceAsStream("/log4j-1.xml");
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        initConverter().convert(inputStream, outputStream);
        Assert.assertEquals(readFile("/log4j-1.properties"), outputStream.toString());
    }

    private String readFile(String file) throws IOException {
        byte[] buffer = new byte[40960];
        int read = IOUtils.read(getClass().getResourceAsStream(file), buffer);
        return new String(buffer, 0, read);
    }

    private Converter initConverter() {
        return new XmlToPropertiesConverter();
    }
}
