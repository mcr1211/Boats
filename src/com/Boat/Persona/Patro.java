/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Boat.Persona;

/**
 *
 * @author Toni Dalmau Martínez
 */
public class Patro extends Persona {
    
    private String titulacio;
    private double costServei;

    public Patro(String titulacio, double costServei, String nom, String llinatge, Document document, String numDocument, String adreça, int telefon, String email) {
        super(nom, llinatge, document, numDocument, adreça, telefon, email);
        this.titulacio = titulacio;
        this.costServei = costServei;
    }

    public String getTitulacio() {
        return titulacio;
    }

    public void setTitulacio(String titulacio) {
        this.titulacio = titulacio;
    }

    public double getCostServei() {
        return costServei;
    }

    public void setCostServei(double costServei) {
        this.costServei = costServei;
    }

    @Override
    public String toString() {
        return super.toString() + "Patro{" + "titulacio=" + titulacio + ", costServei=" + costServei + '}';
    }
    
    
    
}
