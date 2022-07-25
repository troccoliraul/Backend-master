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
import com.tutorial.crud.dto.ProyectosDto;
import com.tutorial.crud.entity.Proyectos;
import com.tutorial.crud.service.ProyectosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proyectos")
@CrossOrigin(origins = "*")
public class ProyectosController {
    
    @Autowired
    ProyectosService proyectoService;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Proyectos>> list(){
        List<Proyectos> list = proyectoService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
 
    @GetMapping("/detail/{id}")
    public ResponseEntity<Proyectos> getById(@PathVariable("id") int id){
        if(!proyectoService.existsById(id))
            return new ResponseEntity(new Mensaje("No se encontro el resgitro"), HttpStatus.NOT_FOUND);
        Proyectos proyectos = proyectoService.getOne(id).get();
        return new ResponseEntity(proyectos, HttpStatus.OK);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
     public ResponseEntity<?> create(@RequestBody ProyectosDto proyectoDto){    
        Proyectos proyectos = new Proyectos();
        proyectos.setProyecto(proyectoDto.getProyecto());
        proyectos.setUrl_proyecto(proyectoDto.getUrl_proyecto());
        proyectos.setDescripcion(proyectoDto.getDescripcion());
        proyectoService.save(proyectos);
        return new ResponseEntity(new Mensaje("El producto fue creado"), HttpStatus.OK);
    }
     
     
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id")int id, @RequestBody ProyectosDto proyectoDto){
        
        Proyectos proyectos = proyectoService.getOne(id).get();
        proyectos.setProyecto(proyectoDto.getProyecto());
        proyectos.setUrl_proyecto(proyectoDto.getUrl_proyecto());
        proyectos.setDescripcion(proyectoDto.getDescripcion());
        proyectoService.save(proyectos);
        return new ResponseEntity(new Mensaje("Registro de Proyecto Actualizado"), HttpStatus.OK);
    }
  
  
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id")int id){
        if(!proyectoService.existsById(id))
            return new ResponseEntity(new Mensaje("No se encontro ningun registro de Proyecto"), HttpStatus.NOT_FOUND);
        proyectoService.delete(id);
        return new ResponseEntity(new Mensaje("Proyecto eliminado"), HttpStatus.OK);
    }
}
