/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial.crud.controller;

/**
 *
 * @author Trocc
 */
import com.tutorial.crud.dto.Mensaje;
import com.tutorial.crud.dto.personadto;
import com.tutorial.crud.entity.persona;
import com.tutorial.crud.service.personaservice;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
@CrossOrigin(origins = "*")
public class persona_controller {
    
    @Autowired
    personaservice Personaservice;
    
    @GetMapping("/lista")
    public ResponseEntity<List<persona>> list(){
        List<persona> list = Personaservice.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<persona> getById(@PathVariable("id") int id){
        if(!Personaservice.existsById(id))
            return new ResponseEntity(new Mensaje("No se encontro el resgitro"), HttpStatus.NOT_FOUND);
        persona Persona = Personaservice.getOne(id).get();
        return new ResponseEntity(Persona, HttpStatus.OK);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id")int id, @RequestBody personadto Personadto){
        
        persona Persona = Personaservice.getOne(id).get();
        Persona.setapellido(Personadto.getapellido());
        Persona.setnombre(Personadto.getnombre());
        Persona.setfecha_nacimiento(Personadto.getfecha_nacimiento());
        Persona.setcorreo(Personadto.getcorreo());
        Persona.setidioma(Personadto.getidioma());
        Persona.setdomicilio(Personadto.getdomicilio());
        Persona.settelefono(Personadto.gettelefono());
        Persona.setsobre_mi(Personadto.getsobre_mi());
        Persona.seturl_foto(Personadto.geturl_foto());
        Persona.seturl_img(Personadto.geturl_img());
        Personaservice.save(Persona);
        return new ResponseEntity(new Mensaje("Registro de Educacion Actualizado"), HttpStatus.OK);
    }
    
    
}
