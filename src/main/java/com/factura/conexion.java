package com.factura;

import java.sql.*;

public class conexion {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3333/op";
        String username = "root";
        String password = "sasa";


        try (Connection con = DriverManager.getConnection(url, username, password);
            // verificar que saca informacion de la base de datos
            Statement stmt = con.createStatement();
            ResultSet resultado = stmt.executeQuery("SELECT * FROM clientes")) {
            
            System.out.println("Conexion exitosa");
            while(resultado.next()){
                System.out.println(resultado.getString("nombre"));
            }



        }catch (SQLException e){

            System.out.println("Error de conexion");




        }
    }
}
