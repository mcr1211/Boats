/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Boat.Persona;

import com.Boat.Exception.AfegirException;
import com.Boat.Exception.LlistesException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**
 *
 * @author Toni Dalmau Martínez
 */
public class Empleat extends Persona {

    protected Date dataAlta;
    protected double nomina;
    ArrayList<Habilitats> llistaHabilitats;

    public Empleat(Date dataAlta, double nomina, String nom, String llinatge, Document document, String numDocument, String adreça, int telefon, String email) {
        super(nom, llinatge, document, numDocument, adreça, telefon, email);
        this.dataAlta = dataAlta;
        this.nomina = nomina;
        llistaHabilitats = new ArrayList<>();
    }

    public void afegirHabilitat(Habilitats nova) throws AfegirException {

        if (llistaHabilitats.contains(nova)) {
            throw new AfegirException("No s'ha afegit, perqué ja existeix");
        } else {
            llistaHabilitats.add(nova);

        }

    }

    public void eliminarHabilitat(Habilitats habilitat) {

        Iterator<Habilitats> it = llistaHabilitats.iterator();

        while (it.hasNext()) {
            Habilitats elemento = it.next();
            if (elemento == habilitat) {
                it.remove();
            }

        }
    }

    public ArrayList<Habilitats> mostraHabilitats() throws LlistesException {

        if (llistaHabilitats.isEmpty()) {
            throw new LlistesException("La llista esta buida");

        } else {
            getLlistaHabilitats();
        }
        return llistaHabilitats;

    }

    public ArrayList<Habilitats> getLlistaHabilitats() {

        return llistaHabilitats;
    }

    public void setLlistaHabilitats(ArrayList<Habilitats> llistaHabilitats) {
        this.llistaHabilitats = llistaHabilitats;
    }

    public Date getDataAlta() {
        return dataAlta;
    }

    public void setDataAlta(Date dataAlta) {
        this.dataAlta = dataAlta;
    }

    public double getNomina() {
        return nomina;
    }

    public void setNomina(double nomina) {
        this.nomina = nomina;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleat{" + "dataAlta=" + dataAlta +  ", nomina=" + nomina + '}';
    }

}
