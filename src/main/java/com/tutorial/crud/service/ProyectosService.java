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
import com.tutorial.crud.entity.Proyectos;
import com.tutorial.crud.repository.ProyectosRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProyectosService {
    
    @Autowired
    ProyectosRepository proyectosRepository;
    
    public List<Proyectos> list(){
        return proyectosRepository.findAll();
    }

    
    public Optional<Proyectos> getOne(int id){
        return proyectosRepository.findById(id);
    }

  

    public void  save(Proyectos proyectos){
        proyectosRepository.save(proyectos);
    }
    
    public void delete(int id){
        proyectosRepository.deleteById(id);
    }

    public boolean existsById(int id){
        return proyectosRepository.existsById(id);
    }
}
