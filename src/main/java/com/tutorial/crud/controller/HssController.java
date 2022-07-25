/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial.crud.controller;

import com.tutorial.crud.dto.HssDto;
import com.tutorial.crud.dto.Mensaje;
import com.tutorial.crud.entity.Hss;
import com.tutorial.crud.service.HssService;
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

/**
 *
 * @author Trocc
 */

@RestController
@RequestMapping("/hss")
@CrossOrigin(origins = "*")
public class HssController {
    @Autowired
    HssService hssService;

    @GetMapping("/lista")
    public ResponseEntity<List<Hss>> list(){
        List<Hss> list = hssService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Hss> getById(@PathVariable("id") int id){
        if(!hssService.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Hss educacion = hssService.getOne(id).get();
        return new ResponseEntity(educacion, HttpStatus.OK);
    }
    
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
     public ResponseEntity<?> create(@RequestBody HssDto hssDto){    
        Hss hss = new Hss();
        hss.setPercent(hssDto.getPercent());
        hss.setTitle(hssDto.getTitle());
        hss.setSubtitle(hssDto.getSubtitle());
        hssService.save(hss);
        return new ResponseEntity(new Mensaje("El producto fue creado"), HttpStatus.OK);
    }
     
     
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id")int id, @RequestBody HssDto hssDto){
        
        Hss hss = hssService.getOne(id).get();
        hss.setPercent(hssDto.getPercent());
        hss.setTitle(hssDto.getTitle());
        hss.setSubtitle(hssDto.getSubtitle());
        hssService.save(hss);
        return new ResponseEntity(new Mensaje("Registro de Educacion Actualizado"), HttpStatus.OK);
    }
  
  
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id")int id){
        if(!hssService.existsById(id))
            return new ResponseEntity(new Mensaje("No se encontro ningun registro de educacion"), HttpStatus.NOT_FOUND);
        hssService.delete(id);
        return new ResponseEntity(new Mensaje("Educacion eliminado"), HttpStatus.OK);
    }


}
