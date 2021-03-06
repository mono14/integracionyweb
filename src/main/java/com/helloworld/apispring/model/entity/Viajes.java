package com.helloworld.apispring.model.entity;
// Generated 13/10/2018 07:27:36 PM by Hibernate Tools 4.3.1


import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.HashSet;
import java.util.Set;

/**
 * Viajes generated by hbm2java
 */
public class Viajes  implements java.io.Serializable {


     private Integer idViajes;
     private String fechaSalida;
     private String origen;
     private String destino;
     private String horaSalida;
     private String precio;
     private String ncupos;
     private String placaAutomovil;
     
     @JsonIgnore
     private Set reservases = new HashSet(0);

    public Viajes() {
    }

    public Viajes(String fechaSalida, String origen, String destino, String horaSalida, String precio, String ncupos, String placaAutomovil, Set reservases) {
       this.fechaSalida = fechaSalida;
       this.origen = origen;
       this.destino = destino;
       this.horaSalida = horaSalida;
       this.precio = precio;
       this.ncupos = ncupos;
       this.placaAutomovil = placaAutomovil;
       this.reservases = reservases;
    }
   
    public Integer getIdViajes() {
        return this.idViajes;
    }
    
    public void setIdViajes(Integer idViajes) {
        this.idViajes = idViajes;
    }
    public String getFechaSalida() {
        return this.fechaSalida;
    }
    
    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    public String getOrigen() {
        return this.origen;
    }
    
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    public String getDestino() {
        return this.destino;
    }
    
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public String getHoraSalida() {
        return this.horaSalida;
    }
    
    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }
    public String getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(String precio) {
        this.precio = precio;
    }
    public String getNcupos() {
        return this.ncupos;
    }
    
    public void setNcupos(String ncupos) {
        this.ncupos = ncupos;
    }
    public String getPlacaAutomovil() {
        return this.placaAutomovil;
    }
    
    public void setPlacaAutomovil(String placaAutomovil) {
        this.placaAutomovil = placaAutomovil;
    }
    public Set getReservases() {
        return this.reservases;
    }
    
    public void setReservases(Set reservases) {
        this.reservases = reservases;
    }




}


