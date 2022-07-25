/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial.crud.service;

/**
 *
 * @author Trocc
 */
import com.tutorial.crud.entity.persona;
import com.tutorial.crud.repository.persona_repository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class personaservice {
    
    @Autowired
    persona_repository Persoa_repository;
    
    public List<persona> list(){
        return Persoa_repository.findAll();
    }

    
    public Optional<persona> getOne(int id){
        return Persoa_repository.findById(id);
    }

  

    public void  save(persona Persona){
        Persoa_repository.save(Persona);
    }
    
    public void delete(int id){
        Persoa_repository.deleteById(id);
    }

    public boolean existsById(int id){
        return Persoa_repository.existsById(id);
    }
    
}
