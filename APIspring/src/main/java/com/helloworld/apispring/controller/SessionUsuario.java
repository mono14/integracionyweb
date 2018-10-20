package com.helloworld.apispring.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.helloworld.apispring.model.dao.RepositorioPrueba;

import java.util.Calendar;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

/**
 *
 * @author daniel
 */
@Service
public class SessionUsuario {

    @Autowired
    private RepositorioPrueba pb;
    

    public SessionUsuario() {
    }

    public String horaDelSistema() {
        Calendar now = Calendar.getInstance();
        String hora = now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE);
        System.out.println("" + hora);
        return hora;
    }

    String validacion_Usuarios(String Usuario, String contraseña) {
        String Confirmacion = "";
        if (pb.lista(contraseña, Usuario)) {
            Confirmacion = "Bienvenido " + Usuario;
        } else {
            Confirmacion = "Usuario o contraseña Incorrecto";
        }
        return Confirmacion;
    }
}
