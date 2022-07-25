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
import com.tutorial.crud.entity.Hss;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import com.tutorial.crud.repository.HssRepository;

@Service
@Transactional
public class HssService {
@Autowired
    HssRepository shhRepository;

    
    public List<Hss> list(){
        return shhRepository.findAll();
    }

    
    public Optional<Hss> getOne(int id){
        return shhRepository.findById(id);
    }

  

    public void  save(Hss hss){
        shhRepository.save(hss);
    }
    
    public void delete(int id){
        shhRepository.deleteById(id);
    }

    public boolean existsById(int id){
        return shhRepository.existsById(id);
    }

   
}