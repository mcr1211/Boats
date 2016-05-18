/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Boat.Empresa;

import com.Boat.Operacions.Lloguer;
import com.Boat.Operacions.Reparacions;
import com.Boat.Operacions.Venda;
import com.Boat.Persona.Client;
import com.Boat.Persona.Empleat;
import com.Boat.Persona.Persona;
import com.Boat.Vaixell.Vaixell;
import java.util.ArrayList;

/**
 *
 * @author Elio
 */
public class Empresa {

    private String nomEmp;
    private ArrayList<Vaixell> llistaVaixell;
    private ArrayList<Client> llistaClient;
    private ArrayList<Empleat> llistaEmpleat;
    private ArrayList<Venda> llistaVenda;
    private ArrayList<Lloguer> llistaLloguer;
    private ArrayList<Reparacions> llistaReparacions;

    public Empresa(String nom) {
        this.nomEmp = nomEmp;
        this.llistaVaixell = llistaVaixell;
        this.llistaClient = llistaClient;
        this.llistaEmpleat = llistaEmpleat;
        this.llistaVenda = llistaVenda;
        this.llistaLloguer = llistaLloguer;
        this.llistaReparacions = llistaReparacions;
    }

    public String getNom() {
        return nomEmp;
    }

    public void setNom(String nom) {
        this.nomEmp = nom;
    }

    public ArrayList<Vaixell> getLlistaVaixell() {
        return llistaVaixell;
    }

    public void setLlistaVaixell(ArrayList<Vaixell> llistaVaixell) {
        this.llistaVaixell = llistaVaixell;
    }

    public ArrayList<Client> getLlistaClient() {
        return llistaClient;
    }

    public void setLlistaClient(ArrayList<Client> llistaClient) {
        this.llistaClient = llistaClient;
    }

    public ArrayList<Empleat> getLlistaEmpleat() {
        return llistaEmpleat;
    }

    public void setLlistaEmpleat(ArrayList<Empleat> llistaEmpleat) {
        this.llistaEmpleat = llistaEmpleat;
    }

    public ArrayList<Venda> getLlistaVenda() {
        return llistaVenda;
    }

    public void setLlistaVenda(ArrayList<Venda> llistaVenda) {
        this.llistaVenda = llistaVenda;
    }

    public ArrayList<Lloguer> getLlistaLloguer() {
        return llistaLloguer;
    }

    public void setLlistaLloguer(ArrayList<Lloguer> llistaLloguer) {
        this.llistaLloguer = llistaLloguer;
    }

    public ArrayList<Reparacions> getLlistaReparacions() {
        return llistaReparacions;
    }

    public void setLlistaReparacions(ArrayList<Reparacions> llistaReparacions) {
        this.llistaReparacions = llistaReparacions;
    }

    

    @Override
    public String toString() {
        return "Empresa{" + "nom=" + nomEmp + ", llistaVaixell=" + llistaVaixell + ", llistaClient=" + llistaClient + ", llistaEmpleat=" + llistaEmpleat + ", llistaVenda=" + llistaVenda + ", llistaLloguer=" + llistaLloguer + ", llistaReparacions=" + llistaReparacions + '}';
    }
    
    public boolean afegirClient(String numDocument) {
        for (Client d : llistaClient) {
            if (d.getNumDocument().equalsIgnoreCase(numDocument)) {
               return false;
            }else{
                llistaClient.add(d);
                return true;
            }
        }
        return false;
    }
    
   

}
