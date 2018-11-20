/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helloworld.apispring.controller;

import com.helloworld.apispring.model.entity.Reservas;
import com.helloworld.apispring.model.entity.Viajes;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class Controlador {

    @Autowired
    public EjemploServicio ejemploServicio;

    @Autowired
    public SessionUsuario Su;
    @Autowired
    public SessionViajes Sviajes;
   
    @Autowired
    public SessionReservas Sessionreservas;

    @RequestMapping(value = "/horas/", method = RequestMethod.GET)
    public ResponseEntity<String> obtenerHoraActual() {
        String hora = Su.horaDelSistema();
        return new ResponseEntity<String>(hora, HttpStatus.OK);
    }

    @RequestMapping(value = "/random/", method = RequestMethod.GET)
    public ResponseEntity<String> updateServiciosEstaciones(@RequestParam("limite") int limite) {
        String numeroAleatorio = ejemploServicio.random(limite) + "";
        return new ResponseEntity<String>(numeroAleatorio, HttpStatus.OK);
    }

  
    @RequestMapping(value = "/iniciarSesion", method = RequestMethod.GET)
    public ResponseEntity<String> iniciarSesion(@RequestParam("usu") String Usuario, @RequestParam("pass") String contraseña) {
        String Respuesta = Su.validacion_Usuarios(Usuario, contraseña);
        return new ResponseEntity<String>(Respuesta, HttpStatus.OK);
    }

    @RequestMapping(value = "/Buscarviaje/", method = RequestMethod.GET)
    public ResponseEntity<List<Viajes>> BusquedaViajes(@RequestParam("Fecha") String Fecha,
             @RequestParam("Origen") String Origen, @RequestParam("Destino") String Destino) {
        List<Viajes> lista = Sviajes.Lista_Viajes(Fecha, Origen, Destino);
        return new ResponseEntity<List<Viajes>>(lista, HttpStatus.OK);
    }
    @RequestMapping(value = "/reservas/",method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> reservas(@RequestBody Reservas reserva){
        String respuesta=Sessionreservas.crearServicio(reserva);
        
        return new ResponseEntity<String>(respuesta,HttpStatus.OK);
    }

}
