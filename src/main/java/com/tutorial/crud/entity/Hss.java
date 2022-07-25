/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial.crud.entity;

/**
 *
 * @author Trocc
 */
import java.io.Serializable;
import javax.persistence.*;


@Entity
public class Hss implements Serializable{
 @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
 
    private String percent;
    private String title;
    private String subtitle;

    public Hss() {
    }

    public Hss(int id, String percent, String title, String subtitle) {
        this.id = id;
        this.percent = percent;
        this.title = title;
        this.subtitle = subtitle;
    }
    
    public Hss(String percent, String title, String subtitle) {
        this.percent = percent;
        this.title = title;
        this.subtitle = subtitle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }
  
    
    
}
