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
public class Comercial extends Empleat {

    private int comissio;

    public Comercial(int comissio, Date dataAlta, double nomina, String nom, String llinatge, Document document, String numDocument, String adreça, int telefon, String email) {
        super(dataAlta, nomina, nom, llinatge, document, numDocument, adreça, telefon, email);
        this.comissio = comissio;
    }



    public int getComissio() {
        return comissio;
    }

    public void setComissio(int comissio) {
        this.comissio = comissio;
    }

    @Override
    public String toString() {
        return super.toString() + "Comercial{" + "comissio=" + comissio + '}';
    }

}
