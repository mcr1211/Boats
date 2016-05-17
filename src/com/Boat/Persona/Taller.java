/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Boat.Persona;

import java.util.Date;

/**
 *
 * @author Toni Dalmau Martínez
 */
public class Taller extends Empleat {
    
    private Habilitat skill;

    public Taller(Habilitat skill, Date dataAlta, double sou, double nomina, String nom, String llinatge, Document document, String numDocument, String adreça, int telefon, String email) {
        super(dataAlta, sou, nomina, nom, llinatge, document, numDocument, adreça, telefon, email);
        this.skill = skill;
    }

    public Habilitat getSkill() {
        return skill;
    }

    public void setSkill(Habilitat skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return super.toString() + "Taller{" + "skill=" + skill + '}';
    }
    
    
}
