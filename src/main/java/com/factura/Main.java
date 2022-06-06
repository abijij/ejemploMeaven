package com.factura;

import com.factura.config.Conexion;
import com.factura.config.PropertiesReader;
import com.factura.dtos.Cliente;
import com.factura.services.ClienteService;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        System.out.println("Cargando propiedades");
        try {
            PropertiesReader.cargarProperties();
            PropertiesReader.cargarProperties();
            PropertiesReader.cargarProperties();
            PropertiesReader.cargarProperties();
            PropertiesReader.cargarProperties();
        } catch (IOException e) {
            System.out.println("Problemas al cargar el propierties");
            e.printStackTrace();
        }

        System.out.println("Probando conexion con base de datos");
        try {
            Connection conexion = Conexion.getMysqlConnection();
        } catch (SQLException e) {
            System.out.println("Fallo al intentar conectar con bs");
            e.printStackTrace();
        }
        Cliente cliente = new Cliente();
        cliente.setId(1);
        cliente.setNombre("EDGAR");
        if(ClienteService.guardarCliente(cliente)){
            System.out.println("Guardado exitosamente");
        }



    }

}