/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Boat.Operacions;

import com.Boat.Persona.Taller;
import com.Boat.Vaixell.Vaixell;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Toni Dalmau Martínez
 */
public class Reparacions {

    private ArrayList<Taller> treballadors;
    private String lloc;
    private Date dataInici;
    private Date dataFi;
    private String descripcio;
    private Estat estat;
    private Vaixell vaixell;
    private double preu;
    private int numReparacio;

    public Reparacions(String lloc, Date dataInici, Date dataFi, String descripcio, Estat estat, Vaixell vaixell, double preu,int numReparacio) {
        this.lloc = lloc;
        this.dataInici = dataInici;
        this.dataFi = dataFi;
        this.descripcio = descripcio;
        this.estat = estat;
        this.vaixell = vaixell;
        this.preu = preu;
        this.treballadors = new ArrayList<Taller>();
        this.numReparacio = numReparacio;
    }

    public ArrayList<Taller> getTreballadors() {
        return treballadors;
    }

    public void setTreballadors(ArrayList<Taller> treballadors) {
        this.treballadors = treballadors;
    }

    public int getNumReparacio() {
        return numReparacio;
    }

    public void setNumReparacio(int numReparacio) {
        this.numReparacio = numReparacio;
    }

    public String getLloc() {
        return lloc;
    }

    public void setLloc(String lloc) {
        this.lloc = lloc;
    }

    public Date getDataInici() {
        return dataInici;
    }

    public void setDataInici(Date dataInici) {
        this.dataInici = dataInici;
    }

    public Date getDataFi() {
        return dataFi;
    }

    public void setDataFi(Date dataFi) {
        this.dataFi = dataFi;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public Estat getEstat() {
        return estat;
    }

    public void setEstat(Estat estat) {
        this.estat = estat;
    }

    public Vaixell getVaixell() {
        return vaixell;
    }

    public void setVaixell(Vaixell vaixell) {
        this.vaixell = vaixell;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public void afegirTaller(Taller t) {
        treballadors.add(t);
    }

    public void eliminarTaller(Taller t) {
        treballadors.remove(t);
    }

}