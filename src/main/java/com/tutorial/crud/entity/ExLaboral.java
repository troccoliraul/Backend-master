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
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ExLaboral implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
 
    private String nom_empresa;
    private String fecha_inicio;
    private String fecha_fin;
    private String descripcion;
    private String trabajo_actual;
    
    
    public ExLaboral(){    
    }
    
    public ExLaboral(int id, String nom_empresa, String fecha_inicio, String fecha_fin, String descripcion, String trabajo_actual){
        this.id = id;
        this.nom_empresa = nom_empresa;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.descripcion = descripcion;
        this.trabajo_actual = trabajo_actual;        
     }
    
    public ExLaboral( String nom_empresa, String fecha_inicio, String fecha_fin, String descripcion, String trabajo_actual){
        this.nom_empresa = nom_empresa;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.descripcion = descripcion;
        this.trabajo_actual = trabajo_actual;        
     }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_empresa() {
        return nom_empresa;
    }

    public void setNom_empresa(String nom_empresa) {
        this.nom_empresa = nom_empresa;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String getTrabajo_actual() {
        return trabajo_actual;
    }

    public void setTrabajo_actual(String trabajo_actual) {
        this.trabajo_actual = trabajo_actual;
    }
    
}
