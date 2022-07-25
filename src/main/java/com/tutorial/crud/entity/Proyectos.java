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
public class Proyectos implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String proyecto;
    private String url_proyecto;
    private String descripcion;
    
    public Proyectos(){
        }
    
    public Proyectos(int id, String proyecto, String url_proyecto, String descripcion) {
        this.id = id;
        this.proyecto = proyecto;
        this.url_proyecto = url_proyecto;
        this.descripcion = descripcion;
    }
    
    public Proyectos(String proyecto, String url_proyecto, String descripcion) {
        this.proyecto = proyecto;
        this.url_proyecto = url_proyecto;
        this.descripcion = descripcion;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    public String getUrl_proyecto() {
        return url_proyecto;
    }

    public void setUrl_proyecto(String url_proyecto) {
        this.url_proyecto = url_proyecto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}