package com.herokuapp.utils;

import java.io.*;
import java.util.Properties;

public class propertiesUtil {

    public static Properties loadProperties(String filePath) throws IOException {

        File file=new File(filePath);
        InputStream inputStream=new FileInputStream(file);

        Properties properties=new Properties();
        properties.load(inputStream);
        inputStream.close();
        return properties;


    }
}
