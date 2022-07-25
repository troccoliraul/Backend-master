/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial.crud.dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author Trocc
 */
public class HssDto {

    @NotBlank
    private String percent;
    @NotBlank
    private String title;
    @NotBlank
    private String subtitle;
   
    public HssDto() {
    }

    public HssDto(@NotBlank String percent,@NotBlank String title, @NotBlank String subtitle) {
        this.percent = percent;
        this.title = title;
        this.subtitle= subtitle;
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
