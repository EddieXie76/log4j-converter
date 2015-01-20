package org.log4j.converter;

import org.apache.commons.lang3.StringUtils;

import java.io.*;

public class Main {
    private static final XmlToPropertiesConverter CONVERTER = new XmlToPropertiesConverter();

    public static void main(String[] args) throws IOException {
        int maxDeep = 10;
        if (args.length > 1) {
            maxDeep = Integer.parseInt(args[1]);
        }
        findAndConvert(args[0], maxDeep);
    }

    private static void findAndConvert(String path, int maxDeep) throws IOException {
        File file = new File(path);
        if (file.isDirectory() && maxDeep > 0) {
            System.out.println(file.getPath());
            File[] subFiles = file.listFiles();
            if (subFiles != null) {
                for (File subFile : subFiles) {
                    if (subFile.isHidden() || subFile.getName().startsWith(".")) {
                        continue;
                    }
                    findAndConvert(subFile.getAbsolutePath(), maxDeep - 1);
                }
            }
        }
        if (file.getName().equals("log4j.xml")) {
            File newFile = new File(StringUtils.removeEnd(file.getPath(), "xml") + "properties");
            System.out.println("Convert " + file.getPath() + " to " + newFile.getPath());
            CONVERTER.convert(new FileInputStream(file), new FileOutputStream(newFile));
        }
    }
}
