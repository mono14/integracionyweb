/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helloworld.apispring.controller;

import com.helloworld.apispring.model.dao.RepositorioPrueba;
import com.helloworld.apispring.model.dao.RepositorioReservas;
import com.helloworld.apispring.model.dao.RepositorioViajes;
import com.helloworld.apispring.model.entity.Reservas;
import com.helloworld.apispring.model.entity.Usuarios;
import com.helloworld.apispring.model.entity.Viajes;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

/**
 *
 * @author daniel
 */
@Service
public class SessionReservas {

    @Autowired
    private RepositorioReservas RR;

    @Autowired
    private RepositorioViajes RV;
    @Autowired
    private RepositorioPrueba RP;

    public SessionReservas() {
    }

    String crearServicio(Reservas reserva) {
        Viajes viaje=RV.viaje(reserva.getIdViajes());
        Usuarios usuario=RP.Usuario(reserva.getIdUsuario());
        reserva.setViajes(viaje);
        reserva.setUsuarios(usuario);
        return "Reserva hecha"+ RR.insertarRegistro(reserva);
    }

}
