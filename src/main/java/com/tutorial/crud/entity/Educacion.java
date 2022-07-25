/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial.crud.entity;

/**
 *
 * @author Trocc
 */
import java.io.Serializable;
import javax.persistence.*;


@Entity
public class Educacion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
 
    private String centro;
    private String titulo;
    private String anio_ingreso;
    private String anio_egreso;

    public Educacion() {
    }

    public Educacion(int id, String centro, String titulo, String anio_ingreso, String anio_egreso) {
        this.id = id;
        this.centro = centro;
        this.titulo = titulo;
        this.anio_ingreso = anio_ingreso;
        this.anio_egreso = anio_egreso;
    }
    
      public Educacion(String centro, String titulo, String anio_ingreso, String anio_egreso) {
        this.centro = centro;
        this.titulo = titulo;
        this.anio_ingreso = anio_ingreso;
        this.anio_egreso = anio_egreso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnio_ingreso() {
        return anio_ingreso;
    }

    public void setAnio_ingreso(String anio_ingreso) {
        this.anio_ingreso = anio_ingreso;
    }

    public String getAnio_egreso() {
        return anio_egreso;
    }

    public void setAnio_egreso(String anio_egreso) {
        this.anio_egreso = anio_egreso;
    }
    
    
    
}
