/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial.crud.repository;

/**
 *
 * @author Trocc
 */
import com.tutorial.crud.entity.persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface persona_repository extends JpaRepository<persona, Integer>{


}
