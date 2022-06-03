package com.factura.services;

import com.factura.daos.InsertaClienteDao;
import com.factura.dtos.Cliente;
import com.factura.dtos.ResultadoDto;

import java.util.Map;

public class ClienteService {

    public static boolean esClienteValido(Cliente cliente) {
        if (cliente.getId() < -1) {
            return false;
        }
        return true;
    }

    public static boolean guardarCliente(Cliente cliente){
        if (esClienteValido(cliente)){
            InsertaClienteDao insertaClienteDao = new InsertaClienteDao(cliente);
            ResultadoDto resultadoDto =insertaClienteDao.obtenerEstadoGuardarCliente();
            return resultadoDto.getCodigo() == InsertaClienteDao.STATUS_OK;
        }
        return false;
    }
    private boolean verificaId(Cliente cliente){
        // FUNCION IR A BASE DATOS Y PREGUNTAR SI EL ID EXISTE
        return true;
    }
}
