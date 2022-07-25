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


public class ExLaboralDto {
    
    @NotBlank
    private String nom_empresa;
    @NotBlank
    private String fecha_inicio;
    @NotBlank
    private String fecha_fin;
    @NotBlank
    private String descripcion;
    @NotBlank
    private String trabajo_actual;
    
    
    public ExLaboralDto(){    
    }
    
    public ExLaboralDto(@NotBlank String nom_empresa,@NotBlank String fecha_inicio,@NotBlank String fecha_fin,
                        @NotBlank String descripcion,@NotBlank String trabajo_actual){
        this.nom_empresa = nom_empresa;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.descripcion = descripcion;
        this.trabajo_actual = trabajo_actual;        
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
