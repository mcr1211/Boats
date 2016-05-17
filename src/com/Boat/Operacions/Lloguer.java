/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Boat.Operacions;

import com.Boat.Persona.Client;
import com.Boat.Persona.Patro;
import com.Boat.Vaixell.Vaixell;
import java.util.Date;

/**
 *
 * @author Toni Dalmau Martínez
 */
public class Lloguer {
    
    private Date dataInici;
    private Date dataFi;
    private Patro patro;
    private Vaixell vaixell;
    private double preu;
    private Estat estat;
    private Client client;
    private int idLloguer;

    public Lloguer(Date dataInici, Date dataFi, Patro patro, Vaixell vaixell, double preu, Estat estat, Client client, int idLloguer) {
        this.dataInici = dataInici;
        this.dataFi = dataFi;
        this.patro = patro;
        this.vaixell = vaixell;
        this.preu = preu;
        this.estat = estat;
        this.client = client;
        this.idLloguer = idLloguer;
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

    public Patro getPatro() {
        return patro;
    }

    public void setPatro(Patro patro) {
        this.patro = patro;
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

    public Estat getEstat() {
        return estat;
    }

    public void setEstat(Estat estat) {
        this.estat = estat;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getIdLloguer() {
        return idLloguer;
    }

    public void setIdLloguer(int idLloguer) {
        this.idLloguer = idLloguer;
    }

    @Override
    public String toString() {
        return "Lloguer{" + "dataInici=" + dataInici + ", dataFi=" + dataFi + ", patro=" + patro + ", vaixell=" + vaixell + ", preu=" + preu + ", estat=" + estat + ", client=" + client + ", idLloguer=" + idLloguer + '}';
    }
    
    
}
