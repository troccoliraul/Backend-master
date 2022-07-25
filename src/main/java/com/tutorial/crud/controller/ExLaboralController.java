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
import com.tutorial.crud.dto.ExLaboralDto;
import com.tutorial.crud.dto.Mensaje;
import com.tutorial.crud.entity.ExLaboral;
import com.tutorial.crud.service.ExLaboralService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/exlaboral")
@CrossOrigin(origins = "*")
public class ExLaboralController {
    
    @Autowired
    ExLaboralService exLaboralService;
    
    
    @GetMapping("/lista")
    public ResponseEntity<List<ExLaboral>> list(){
        List<ExLaboral> list = exLaboralService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
 
    @GetMapping("/detail/{id}")
    public ResponseEntity<ExLaboral> getById(@PathVariable("id") int id){
        if(!exLaboralService.existsById(id))
            return new ResponseEntity(new Mensaje("No se encontro el resgitro"), HttpStatus.NOT_FOUND);
        ExLaboral exLaboral = exLaboralService.getOne(id).get();
        return new ResponseEntity(exLaboral, HttpStatus.OK);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
     public ResponseEntity<?> create(@RequestBody ExLaboralDto exLaboralDto){    
        ExLaboral exLaboral = new ExLaboral();
        exLaboral.setNom_empresa(exLaboralDto.getNom_empresa());
        exLaboral.setFecha_inicio(exLaboralDto.getFecha_inicio());
        exLaboral.setFecha_fin(exLaboralDto.getFecha_fin());
        exLaboral.setDescripcion(exLaboralDto.getDescripcion());
        exLaboral.setTrabajo_actual(exLaboralDto.getTrabajo_actual());
        exLaboralService.save(exLaboral);
        return new ResponseEntity(new Mensaje("El producto fue creado"), HttpStatus.OK);
    }
     
     
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id")int id, @RequestBody ExLaboralDto exLaboralDto){
        
        ExLaboral exLaboral = exLaboralService.getOne(id).get();
        exLaboral.setNom_empresa(exLaboralDto.getNom_empresa());
        exLaboral.setFecha_inicio(exLaboralDto.getFecha_inicio());
        exLaboral.setFecha_fin(exLaboralDto.getFecha_fin());
        exLaboral.setDescripcion(exLaboralDto.getDescripcion());
        exLaboral.setTrabajo_actual(exLaboralDto.getTrabajo_actual());
        exLaboralService.save(exLaboral);
        return new ResponseEntity(new Mensaje("Registro de Educacion Actualizado"), HttpStatus.OK);
    }
  
  
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id")int id){
        if(!exLaboralService.existsById(id))
            return new ResponseEntity(new Mensaje("No se encontro ningun registro de educacion"), HttpStatus.NOT_FOUND);
        exLaboralService.delete(id);
        return new ResponseEntity(new Mensaje("Educacion eliminado"), HttpStatus.OK);
    }
    
}
