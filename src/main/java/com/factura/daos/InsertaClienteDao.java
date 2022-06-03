package com.factura.daos;

import com.factura.config.Conexion;
import com.factura.dtos.Cliente;
import com.factura.dtos.ResultadoDto;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class InsertaClienteDao {
    private static final String query = "INSERT INTO FACTURADOR.CLIENTE(COLUMNS) VALUES(?) ";
    private final Cliente cliente;
    private final ResultadoDto resultadoDto = new ResultadoDto();
    public static final int STATUS_OK = 200;
    public static final int STATUS_ERROR = 400;

    public InsertaClienteDao(Cliente cliente) {
        this.cliente = cliente;
    }

    public ResultadoDto obtenerEstadoGuardarCliente() {
        abrirConnection();
        return resultadoDto;
    }

    private void abrirConnection() {
        try (Connection connection = Conexion.getMysqlConnection();
             CallableStatement callableStatement = connection.prepareCall(query)) {
            callableStatement.setInt(1, cliente.getId());
            callableStatement.execute();
            resultadoDto.setCodigo(STATUS_OK);
            resultadoDto.setMessage("EXITO EN EL GUARADO");
        } catch (SQLException e) {
            resultadoDto.setCodigo(STATUS_ERROR);
            resultadoDto.setMessage("ERROR AL GUARDAR EN BASE DE DATOS");
        }
    }
}
