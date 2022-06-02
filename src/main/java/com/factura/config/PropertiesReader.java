package com.factura.config;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
    private static Properties properties;

    public static Properties cargarProperties() throws IOException {
        if (properties == null) {
            System.out.println("Carga properties");
            properties = new Properties();
            properties.load(ClassLoader.getSystemResourceAsStream("aplication.properties"));
            return properties;
        }
        return properties;
    }
}
