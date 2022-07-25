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


public class personadto {
    
    @NotBlank
    private String apellido;
    @NotBlank
    private String nombre;
    @NotBlank
    private String fecha_nacimiento;
    @NotBlank
    private String correo;
    @NotBlank
    private String idioma;
    @NotBlank
    private String domicilio;
    @NotBlank
    private String telefono;
    @NotBlank
    private String sobre_mi;
    @NotBlank
    private String url_foto;
    @NotBlank
    private String url_img;
    
    public personadto(){
    }
    
    public personadto( @NotBlank String apellido, @NotBlank String nombre, @NotBlank String fecha_nacimiento, @NotBlank
             String correo, @NotBlank String idioma, @NotBlank String domicilio, @NotBlank String telefono, @NotBlank String sobre_mi, @NotBlank
             String url_foto, @NotBlank String url_img) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.correo = correo;
        this.idioma = idioma;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.sobre_mi = sobre_mi;
        this.url_foto = url_foto;
        this.url_img = url_img;
    }
    
    public String getapellido() {
        return apellido;
    }
    
    public void setapellido(String apellido) {
        this.apellido = apellido;
    }
    
     public String getnombre() {
        return nombre;
    }
    
    public void setnombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getfecha_nacimiento() {
        return fecha_nacimiento;
    }
    
    public void setfecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
    public String getcorreo() {
        return correo;
    }
    
    public void setcorreo(String correo) {
        this.correo = correo;
    }
    
    public String getidioma() {
        return idioma;
    }
    
    public void setidioma(String idioma) {
        this.idioma = idioma;
    }
    
    public String getdomicilio() {
        return domicilio;
    }
    
    public void setdomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    
    public String gettelefono() {
        return telefono;
    }
    
    public void settelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String getsobre_mi() {
        return sobre_mi;
    }
    
    public void setsobre_mi(String sobre_mi) {
        this.sobre_mi = sobre_mi;
    }
    
    public String geturl_foto() {
        return url_foto;
    }
    
    public void seturl_foto(String url_foto) {
        this.url_foto = url_foto;
    }
    
    public String geturl_img() {
        return url_img;
    }
    
    public void seturl_img(String url_img) {
        this.url_img = url_img;
    }
}