package com.perfleet.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties;

    static {
        try {
            FileInputStream file = new FileInputStream("configuration.properties");
            properties = new Properties();
            properties.load(file);

            file.close();
        } catch (IOException e) {
            System.out.println("filenotfoundException & IOexception");
            e.getStackTrace();
        }
    }


    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
