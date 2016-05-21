/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Boat.Empresa;

import com.Boat.Exception.AfegirException;
import com.Boat.Exception.LlistesException;
import com.Boat.Model.Model;
import com.Boat.Operacions.Estat;
import com.Boat.Operacions.Lloguer;
import com.Boat.Operacions.Reparacions;
import com.Boat.Operacions.Venda;
import com.Boat.Persona.Client;
import com.Boat.Persona.Comercial;
import com.Boat.Persona.Document;
import com.Boat.Persona.Empleat;
import com.Boat.Persona.Persona;
import com.Boat.Vaixell.Vaixell;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Elio
 */
public class Empresa {

    private String nomEmp;
    private HashMap<String, Vaixell> llistaVaixell;
    private HashMap<String, Client> llistaClient;
    private HashMap<String, Empleat> llistaEmpleat;
    private ArrayList<Venda> llistaVenda;
    private ArrayList<Lloguer> llistaLloguer;
    private ArrayList<Reparacions> llistaReparacions;

    public Empresa(String nom) {
        this.nomEmp = nomEmp;
        llistaVaixell = new HashMap<>();
        llistaClient = new HashMap<>();
        llistaEmpleat = new HashMap<>();
        llistaVenda = new ArrayList<>();
        llistaLloguer = new ArrayList<>();
        llistaReparacions = new ArrayList<>();
    }

    public String getNomEmp() {
        return nomEmp;
    }

    public void setNomEmp(String nomEmp) {
        this.nomEmp = nomEmp;
    }

    public HashMap<String, Vaixell> getLlistaVaixell() {
        return llistaVaixell;
    }

    public void setLlistaVaixell(HashMap<String, Vaixell> llistaVaixell) {
        this.llistaVaixell = llistaVaixell;
    }

    public HashMap<String, Client> getLlistaClient() {
        return llistaClient;
    }

    public void setLlistaClient(HashMap<String, Client> llistaClient) {
        this.llistaClient = llistaClient;
    }

    public HashMap<String, Empleat> getLlistaEmpleat() {
        return llistaEmpleat;
    }

    public void setLlistaEmpleat(HashMap<String, Empleat> llistaEmpleat) {
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
        return "Empresa{" + "nomEmp=" + nomEmp + ", llistaVaixell=" + llistaVaixell + ", llistaClient=" + llistaClient + ", llistaEmpleat=" + llistaEmpleat + ", llistaVenda=" + llistaVenda + ", llistaLloguer=" + llistaLloguer + ", llistaReparacions=" + llistaReparacions + '}';
    }

    public void afegirClient(Client client) throws AfegirException {
        if (llistaClient.containsKey(client.getNumDocument())) {
            throw new AfegirException("No s'ha afegit, perqué ja existeix" + client.getNumDocument());
        }
        llistaClient.put(client.getNumDocument(), client);
    }

    public void afegirVaixell(Vaixell vaixell) throws AfegirException {
        if (llistaVaixell.containsKey(vaixell.getMatricula())) {
            throw new AfegirException("No s'ha afegit, perqué ja existeix" + vaixell.getMatricula());
        }

        llistaVaixell.put(vaixell.getMatricula(), vaixell);

    }

    public void afegirComercial(Comercial comercial) throws AfegirException {
        if (llistaEmpleat.containsKey(comercial.getNumDocument())) {
            throw new AfegirException("No s'ha afegit, perqué ja existeix" + comercial.getNumDocument());
        }
        llistaEmpleat.put(comercial.getNumDocument(), comercial);
    }

    public HashSet<Model> llistesModels() throws LlistesException {
        HashSet<Model> llistaModel = new HashSet<>();
        if (llistaModel.isEmpty()) {
            throw new LlistesException("La llista de Models està buida");
        } else {
            Iterator<Model> models = llistaModel.iterator();
            while (models.hasNext()) {
                System.out.println(models.next());
            }
        }

        return llistaModel;
    }

    public ArrayList<Reparacions> llistaReparacionsPendets() throws LlistesException {
        ArrayList<Reparacions> llistaPendent = new ArrayList();
        if (llistaReparacions.isEmpty()) {
            throw new LlistesException("La llista està buida");
        } else {
            for (Reparacions d : llistaReparacions) {
                if (d.getEstat() == Estat.PENDENT) {
                    llistaPendent.add(d);
                }

            }
            return llistaPendent;
        }

    }
    
    public ArrayList<Reparacions> llistaReparacionsAturades() throws LlistesException {
        ArrayList<Reparacions> llistaAturat = new ArrayList();
        if (llistaReparacions.isEmpty()){
            throw new LlistesException("La llista està buida.");
        }else {
            for (Reparacions d : llistaReparacions) {
                if (d.getEstat() == Estat.ATURAT) {
                    llistaAturat.add(d);
                }
            }
            return llistaAturat;
        }
    }
    
    public ArrayList<Reparacions> llistaReparacions(String matricula) throws LlistesException{
        ArrayList<Reparacions> llistaRep = new ArrayList();
            if(llistaVaixell.containsKey(matricula)){
                for(Reparacions d: llistaReparacions){
                    if(matricula.equalsIgnoreCase(matricula)){
                        llistaRep.add(d);
                    }
                }
            }else if (llistaVaixell.isEmpty()){
                throw new LlistesException("La llista està buida");
            }
            return llistaReparacions;
    }

    
//    public ArrayList<Vaixell> llistarVaixellsPerPreu(double preuMax,double preuMin){
//        ArrayList<Vaixell> preuVaixell = new ArrayList();
//            for(Vaixell d: ){
//                
//            }
//    }
}
