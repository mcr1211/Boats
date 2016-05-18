/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Boat.Persona;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Toni Dalmau Martínez
 */
public class Taller extends Empleat {
    
    private Habilitats skill;
   
    

    public Taller(Habilitats skill, Date dataAlta, double sou, double nomina, String nom, String llinatge, Document document, String numDocument, String adreça, int telefon, String email) {
        super(dataAlta, sou, nomina, nom, llinatge, document, numDocument, adreça, telefon, email);
        this.skill = skill;
    }
    
    

    public Habilitats getSkill() {
        return skill;
    }

    public void setSkill(Habilitats skill) {
        this.skill = skill;
    }

    public Date getDataAlta() {
        return dataAlta;
    }

    public void setDataAlta(Date dataAlta) {
        this.dataAlta = dataAlta;
    }

    public double getSou() {
        return sou;
    }

    public void setSou(double sou) {
        this.sou = sou;
    }

    public double getNomina() {
        return nomina;
    }

    public void setNomina(double nomina) {
        this.nomina = nomina;
    }

    @Override
    public String toString() {
        return "Taller{" + "skill=" + skill + '}';
    }
    
    

    

    

}
