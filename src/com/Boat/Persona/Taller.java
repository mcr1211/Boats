/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Boat.Persona;

import com.Boat.Exception.habilitatException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Toni Dalmau Martínez
 */
public class Taller extends Empleat {

    private ArrayList<Habilitats> skill;

    public Taller(Date dataAlta, double sou, double nomina, String nom, String llinatge, Document document, String numDocument, String adreça, int telefon, String email) {
        super(dataAlta, sou, nomina, nom, llinatge, document, numDocument, adreça, telefon, email);

        this.skill = new ArrayList<Habilitats>();

    }

    public ArrayList<Habilitats> getSkill() {
        return skill;
    }

    public void setSkill(ArrayList<Habilitats> skill) {
        this.skill = skill;
    }

    public void afegirSkill(Habilitats s) throws habilitatException {
        if (skill.isEmpty()) {
            skill.add(s);
        }
        if (skill.contains(s)) {
            throw new habilitatException("Aquesta habilitat ja està posada.");
        } else {
            skill.add(s);
        }
    }

    public void eliminarSkill(Habilitats s) throws habilitatException {
        if(skill.contains(s)){
            skill.remove(s);
        }else{
            throw new habilitatException("Aquesta habilitat no està posada.");
        }
    }

    public ArrayList tornaSkill() {
        return skill;
    }

    @Override
    public String toString() {
        return super.toString() + "Taller{" + "skill=" + skill + '}';
    }

}
