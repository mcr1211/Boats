/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Boat.Vaixell;

import com.Boat.Model.Model;
import com.Boat.Operacions.Estat;
import java.util.Date;

/**
 *
 * @author Toni Dalmau Martínez
 */
public class Vaixell {

    private String marca;
    private Model model;
    private String matricula;
    private String propietari;
    private boolean llogar;
    private Date disponible;
    private Estat estat;
    private double preuLloguer;

    public Vaixell(String marca, Model model, String matricula, String propietari, boolean llogar, Date disponible, Estat estat,double preuLloguer) {
        this.marca = marca;
        this.model = model;
        this.matricula = matricula;
        this.propietari = propietari;
        this.llogar = llogar;
        this.disponible = disponible;
        this.estat = estat;
        this.preuLloguer = preuLloguer;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Estat getEstat() {
        return estat;
    }

    public void setEstat(Estat estat) {
        this.estat = estat;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getPreuLloguer() {
        return preuLloguer;
    }

    public void setPreuLloguer(double preuLloguer) {
        this.preuLloguer = preuLloguer;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getPropietari() {
        return propietari;
    }

    public void setPropietari(String propietari) {
        this.propietari = propietari;
    }

    public boolean isLlogar() {
        return llogar;
    }

    public void setLlogar(boolean llogar) {
        this.llogar = llogar;
    }

    public Date getDisponible() {
        return disponible;
    }

    public void setDisponible(Date disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Vaixell{" + "marca=" + marca + ", model=" + model + ", matricula=" + matricula + ", propietari=" + propietari + ", llogar=" + llogar + ", disponible=" + disponible + '}';
    }

}
