/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helloworld.apispring.controller;

import java.util.Calendar;
import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class EjemploServicio {
    
    
    public String horaDelSistema(){
        Calendar now = Calendar.getInstance();
        String hora = now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE);
        System.out.println(""+hora);
        return hora;
    }
    
    public int random( int limite ){
        Random rand = new Random();
        int  n = rand.nextInt(limite) + 1;
        return n;
    }
    
  
    
}
