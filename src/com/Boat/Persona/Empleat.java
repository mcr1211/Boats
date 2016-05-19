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
public class Empleat extends Persona {
    
    protected Date dataAlta;
    protected double sou;
    protected double nomina;
    
    
    ArrayList<Habilitats> llistaHabilitats;
    

    public Empleat(Date dataAlta, double sou, double nomina, String nom, String llinatge, Document document, String numDocument, String adreça, int telefon, String email) {
        super(nom, llinatge, document, numDocument, adreça, telefon, email);
        this.dataAlta = dataAlta;
        this.sou = sou;
        this.nomina = nomina;
    }

    
    public void afegirHabilitat(Habilitats nova){
        llistaHabilitats.add(nova);
        
    }
    
    public ArrayList<Habilitats> mostraHabilitats(){
        
        return llistaHabilitats;
        
    }
    
     public void eliminarHabilitat(Habilitats habilitats) {
         
         
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
        return super.toString() + "Empleat{" + "dataAlta=" + dataAlta + ", sou=" + sou + ", nomina=" + nomina + '}';
    }

   
    
    
}
