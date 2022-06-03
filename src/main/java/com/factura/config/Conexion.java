package com.factura.config;

import com.factura.config.PropertiesReader;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Conexion {

    public static Connection getMysqlConnection() throws SQLException {
        String url;
        String username;
        String password;
        try {
            Properties properties = PropertiesReader.cargarProperties();
            url = properties.getProperty("database.url");
            username = properties.getProperty("database.user");
            password = properties.getProperty("database.password");
        } catch (IOException e) {
            System.out.println("Fallo la carga de los propierties");
            e.printStackTrace();
            url = "dbc:mysql://localhost:3333/op";
            username ="root";
            password="sasa";
        }
        return DriverManager.getConnection(url, username, password);
    }
}
