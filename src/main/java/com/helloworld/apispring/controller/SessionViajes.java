/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helloworld.apispring.controller;

import com.helloworld.apispring.model.dao.RepositorioViajes;
import com.helloworld.apispring.model.entity.Viajes;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author daniel
 */
@Service
public class SessionViajes {

    @Autowired
    RepositorioViajes rv;

    public SessionViajes() {
    }

    List<Viajes> Lista_Viajes(String Fecha, String Origen, String Destino) {
       
    return rv.Lista_viajes(Fecha,Origen,Destino);
    }
    
    Viajes buscar_Viaje(long id){
        return rv.viaje(id);
    }
}
