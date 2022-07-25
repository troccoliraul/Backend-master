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
import com.tutorial.crud.entity.Educacion;
import com.tutorial.crud.repository.EducacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EducacionService {

    @Autowired
    EducacionRepository educacionRepository;

    
    public List<Educacion> list(){
        return educacionRepository.findAll();
    }

    
    public Optional<Educacion> getOne(int id){
        return educacionRepository.findById(id);
    }

  

    public void  save(Educacion educacion){
        educacionRepository.save(educacion);
    }
    
    public void delete(int id){
        educacionRepository.deleteById(id);
    }

    public boolean existsById(int id){
        return educacionRepository.existsById(id);
    }

   
}
