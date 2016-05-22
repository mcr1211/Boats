/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Boat.Persona;

import com.Boat.Persona.Nomina;
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
    protected Nomina nomina;

    public Empleat(Date dataAlta, Nomina nomina, String nom, String llinatge, Document document, String numDocument, String adreça, int telefon, String email) {
        super(nom, llinatge, document, numDocument, adreça, telefon, email);
        this.dataAlta = dataAlta;
        this.nomina = nomina;

    }


    public Date getDataAlta() {
        return dataAlta;
    }

    public void setDataAlta(Date dataAlta) {
        this.dataAlta = dataAlta;
    }

    public Nomina getNomina() {
        return nomina;
    }

    public void setNomina(Nomina nomina) {
        this.nomina = nomina;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleat{" + "dataAlta=" + dataAlta + ", nomina=" + nomina + '}';
    }

}
