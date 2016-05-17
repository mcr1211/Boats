/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Boat.Operacions;

import com.Boat.Persona.Client;
import com.Boat.Persona.Comercial;
import com.Boat.Vaixell.Vaixell;
import java.util.Date;

/**
 *
 * @author Toni Dalmau Martínez
 */
public class Venda {

    private Client client;
    private Vaixell vaixell;
    private Date data;
    private Estat estat;
    private double preu;
    private Comercial comercial;
    private int numVenda;

    public Venda(Client client, Vaixell vaixell, Date data, Estat estat, double preu, Comercial comercial, int numVenda) {
        this.client = client;
        this.vaixell = vaixell;
        this.data = data;
        this.estat = estat;
        this.preu = preu;
        this.comercial = comercial;
        this.numVenda = numVenda;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Vaixell getVaixell() {
        return vaixell;
    }

    public void setVaixell(Vaixell vaixell) {
        this.vaixell = vaixell;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Estat getEstat() {
        return estat;
    }

    public void setEstat(Estat estat) {
        this.estat = estat;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public Comercial getComercial() {
        return comercial;
    }

    public void setComercial(Comercial comercial) {
        this.comercial = comercial;
    }

    public int getNumVenda() {
        return numVenda;
    }

    public void setNumVenda(int numVenda) {
        this.numVenda = numVenda;
    }

    @Override
    public String toString() {
        return "Venda{" + "client=" + client + ", vaixell=" + vaixell + ", data=" + data + ", estat=" + estat + ", preu=" + preu + ", comercial=" + comercial + ", numVenda=" + numVenda + '}';
    }

}
