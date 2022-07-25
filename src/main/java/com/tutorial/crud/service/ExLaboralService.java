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
import com.tutorial.crud.entity.ExLaboral;
import com.tutorial.crud.repository.ExLaboralRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class ExLaboralService {
    
    @Autowired
    ExLaboralRepository exLaboralRepository;
    
    
    public List<ExLaboral> list(){
        return exLaboralRepository.findAll();
    }

    
    public Optional<ExLaboral> getOne(int id){
        return exLaboralRepository.findById(id);
    }

  

    public void  save(ExLaboral exLaboral){
        exLaboralRepository.save(exLaboral);
    }
    
    public void delete(int id){
        exLaboralRepository.deleteById(id);
    }

    public boolean existsById(int id){
        return exLaboralRepository.existsById(id);
    }
    
}
