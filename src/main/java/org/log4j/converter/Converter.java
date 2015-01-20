package org.log4j.converter;

import java.io.*;

public interface Converter {
    void convert(InputStream inputStream, OutputStream outputStream) throws IOException;
}
