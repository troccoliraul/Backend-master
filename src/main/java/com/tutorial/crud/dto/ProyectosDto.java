/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial.crud.dto;

/**
 *
 * @author Trocc
 */
import javax.validation.constraints.NotBlank;


public class ProyectosDto {
    
    @NotBlank
    private String proyecto;
    @NotBlank
    private String url_proyecto;
    @NotBlank
    private String descripcion;
    
    public ProyectosDto(){
        }
    
    public ProyectosDto(@NotBlank String proyecto,@NotBlank String url_proyecto,@NotBlank String descripcion) {
        this.proyecto = proyecto;
        this.url_proyecto = url_proyecto;
        this.descripcion = descripcion;
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
