/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Boat.Empresa;

import com.Boat.Exception.AfegirException;
import com.Boat.Exception.EliminarException;
import com.Boat.Exception.LlistesException;
import com.Boat.Exception.NominaException;
import com.Boat.Exception.RepetitException;
import com.Boat.Model.Model;
import com.Boat.Operacions.Estat;
import com.Boat.Operacions.Lloguer;
import com.Boat.Operacions.Reparacions;
import com.Boat.Operacions.Venda;
import com.Boat.Persona.Client;
import com.Boat.Persona.Comercial;
import com.Boat.Persona.Empleat;
import com.Boat.Persona.Patro;
import com.Boat.Persona.Taller;
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
    private HashMap<String, Comercial> llistaComercial;
    private ArrayList<Venda> llistaVenda;
    private ArrayList<Lloguer> llistaLloguer;
    private ArrayList<Reparacions> llistaReparacions;
    private HashMap<String, Patro> llistaPatro;
    private HashMap<String, Taller> llistaTaller;
    private HashMap<String, Model> llistaModelsDisponibles;
    private ArrayList<Model> llistaModels;

    public Empresa(String nom) {
        this.nomEmp = nomEmp;
        llistaVaixell = new HashMap<>();
        llistaClient = new HashMap<>();
        llistaComercial = new HashMap<>();
        llistaVenda = new ArrayList<>();
        llistaLloguer = new ArrayList<>();
        llistaReparacions = new ArrayList<>();
        llistaPatro = new HashMap<>();
        llistaTaller = new HashMap<>();
        llistaModelsDisponibles = new HashMap<>();
        llistaModels = new ArrayList<>();

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

    public HashMap<String, Comercial> getLlistaEmpleat() {
        return llistaComercial;
    }

    public void setLlistaEmpleat(HashMap<String, Comercial> llistaEmpleat) {
        this.llistaComercial = llistaComercial;
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
        return "Empresa{" + "nomEmp=" + nomEmp + ", llistaVaixell=" + llistaVaixell + ", llistaClient=" + llistaClient + ", llistaComercial=" + llistaComercial + ", llistaVenda=" + llistaVenda + ", llistaLloguer=" + llistaLloguer + ", llistaReparacions=" + llistaReparacions + '}';
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
        if (llistaComercial.containsKey(comercial.getNumDocument())) {
            throw new AfegirException("No s'ha afegit, perqué ja existeix" + comercial.getNumDocument());
        }
        llistaComercial.put(comercial.getNumDocument(), comercial);
    }

    public void afegirPatro(Patro patro) throws AfegirException {
        if (llistaPatro.containsKey(patro.getNumDocument())) {
            throw new AfegirException("");
        } else {
            llistaPatro.put(patro.getNumDocument(), patro);
        }
    }

    public void afegirTaller(Taller taller) throws AfegirException {
        if (llistaTaller.containsKey(taller.getNumDocument())) {
            throw new AfegirException("No s'ha pogut afegir");
        } else {
            llistaTaller.put(taller.getNumDocument(), taller);
        }
    }

    public void afegirLloguer(Lloguer lloguer) throws RepetitException {
        for (Lloguer d : llistaLloguer) {
            if (d.equals(lloguer)) {
                throw new RepetitException("Ja existeix");
            }
        }
        llistaLloguer.add(lloguer);
    }

    public Lloguer eliminarLloguer(int idLloguer) throws LlistesException {
        for (Lloguer d : llistaLloguer) {
            if (d.getIdLloguer() == idLloguer) {
                llistaLloguer.remove(d);
            }
        }
        if (llistaLloguer.isEmpty()) {

        }
        throw new LlistesException("La llista està buida");
    }

    public void afegirVenda(Venda venda) throws RepetitException {
        for (Venda d : llistaVenda) {
            if (d.equals(venda)) {
                throw new RepetitException("Ja existeix");
            }
        }
    }

    public void eliminarVenda(int numVenda) throws EliminarException {
        for (Venda d : llistaVenda) {
            if (d.getNumVenda() == numVenda) {
                llistaVenda.remove(d);
            } else {
                throw new EliminarException("No concideixen el numVenda");
            }
        }
    }

    public void afegirReparacio(Reparacions reparacio) throws RepetitException {
        for (Reparacions d : llistaReparacions) {
            if (d.equals(reparacio)) {
                throw new RepetitException("Ja existeix");
            }
        }
        llistaReparacions.add(reparacio);
    }

    public void eliminarReparacio(int numReparacio) {
        for (Reparacions d : llistaReparacions) {
            if (d.getNumReparacio() == numReparacio) {
                llistaReparacions.remove(d);
            }
        }
    }

    public void eliminarClient(String numDocument) throws EliminarException {
        if (llistaClient.remove(numDocument) == null) {
            throw new EliminarException();
        } else {
            llistaClient.remove(numDocument);
        }
    }

    public void eliminarVaixell(String matricula) throws EliminarException {
        if (llistaVaixell.remove(matricula) == null) {
            throw new EliminarException();
        } else {
            llistaVaixell.remove(matricula);
        }
    }

    public void eliminarComercial(String numDocument) throws EliminarException {
        if (llistaComercial.remove(numDocument) == null) {
            throw new EliminarException();
        } else {
            llistaComercial.remove(numDocument);
        }
    }

    public void eliminarTaller(String numDocument) throws EliminarException {
        if (llistaTaller.remove(numDocument) == null) {
            throw new EliminarException();
        } else {
            llistaTaller.remove(numDocument);
        }
    }

    public void eliminarPatro(String numDocument) throws EliminarException {
        if (llistaPatro.remove(numDocument) == null) {
            throw new EliminarException();
        } else {
            llistaPatro.remove(numDocument);
        }
    }

    public HashSet<Model> llistesModels() throws LlistesException {
        HashSet<Model> llistaModel = new HashSet<>();
        Iterator<Model> models = llistaModel.iterator();
        while (models.hasNext()) {
            System.out.println(models.next());
        }
        if (llistaModel.isEmpty()) {
            throw new LlistesException("La llista de Models està buida");

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
        if (llistaReparacions.isEmpty()) {
            throw new LlistesException("La llista està buida.");
        } else {
            for (Reparacions d : llistaReparacions) {
                if (d.getEstat() == Estat.ATURAT) {
                    llistaAturat.add(d);
                }
            }
            return llistaAturat;
        }
    }

    public ArrayList<Reparacions> llistaReparacions(String matricula) throws LlistesException {
        ArrayList<Reparacions> llistaRep = new ArrayList();
        if (llistaVaixell.containsKey(matricula)) {
            for (Reparacions d : llistaReparacions) {
                if (matricula.equalsIgnoreCase(matricula)) {
                    llistaRep.add(d);
                }
            }
        } else if (llistaVaixell.isEmpty()) {
            throw new LlistesException("La llista està buida");
        }
        return llistaReparacions;
    }

    public ArrayList<Model> llistarTipusEmb(Model tipus) throws LlistesException {
        ArrayList<Model> tipusEmb = new ArrayList();

        Iterator it = llistaVaixell.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            if (tipus.getClass().equals(llistaVaixell.getClass())) {
                tipusEmb.add(tipus);
            }
        }
        if (tipusEmb.isEmpty()) {
            throw new LlistesException("La llista està buida");
        }
        return tipusEmb;
    }

    public ArrayList<Vaixell> llistarEmbPerPreu(double preuMax, double preuMin) throws LlistesException {
        ArrayList<Vaixell> llistaPreus = new ArrayList();

        Iterator it = llistaVaixell.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            Vaixell barco = llistaVaixell.get(e.getKey());
            if (barco.getPreuLloguer() > preuMin && barco.getPreuLloguer() < preuMax) {
                llistaPreus.add(barco);
            }
        }
        if (llistaPreus.isEmpty()) {
            throw new LlistesException("La llista està buida");
        }
        return llistaPreus;
    }

//    public ArrayList<Vaixell> llistaEmbDisponibles(Date inici, Date fi){
//        ArrayList<Vaixell> embDispo = new ArrayList();
//        Iterator it = llistaVaixell.entrySet().iterator();
//            while(it.hasNext()){
//                Map.Entry e = (Map.Entry) it.next();
//            }
//    }
    public double calcularNomina(Empleat empleat) throws NominaException {
        double sou = 1200;
        int comisio = 0;
        int irpf = 4;
        double totalDeduir;
        double totalRetencio;
        double liquidacio = 0;
        ArrayList<Venda> llistaVendes = new ArrayList();

        if (empleat instanceof Comercial) {
            for (Venda d : llistaVendes) {
                if (llistaVendes.contains(empleat.getNumDocument())) {
                    llistaVendes.add(d);
                }
                llistaVendes.size();
            }
            if (llistaVendes.size() == 0) {
                throw new NominaException("Aquest venedor es un vago.");
            }
            if (llistaVendes.size() >= 1 && llistaVendes.size() <= 5) {
                comisio = 5;
            }
            if (llistaVendes.size() >= 6 && llistaVendes.size() <= 10) {
                comisio = 10;
            }
            if (llistaVendes.size() > 10) {
                comisio = 15;
            }
            totalDeduir = sou + (sou * comisio / 100);
            totalRetencio = totalDeduir * (irpf / 100);
            liquidacio = totalDeduir - totalRetencio;
        } else if (empleat instanceof Taller) {
            totalDeduir = sou;
            totalRetencio = totalDeduir * (irpf / 100);
            liquidacio = totalDeduir - totalRetencio;
        }

        return liquidacio;
    }

    public double ferNomina(Comercial comercial, Model preu) {
        ArrayList<Venda> vendesComercial = new ArrayList<>();
        double totalNomina = 0;
        if (llistaVenda.contains(comercial.getNumDocument())) {
            for (Venda d : llistaVenda) {
                totalNomina = comercial.getNomina() * (preu.getPreu() * comercial.getComissio() / 100);
            }
        }
        return totalNomina;
    }

    public HashMap<String, Model> llistaModelsDisponibles() {

        return llistaModelsDisponibles;

    }

    public void afegirLlistaModel(Model model) throws LlistesException {

        if (llistaModels.contains(model)) {
            throw new LlistesException("No s'ha afegit, perqué ja existeix");
        } else {
            llistaModels.add(model);

        }

    }

    public ArrayList<Model> getLlistaModels() {

        return llistaModels;
    }

    public void tornaLlistaModels() {
        for (Model i : llistaModels) {
            System.out.println(i);
        }
    }

    public ArrayList<Model> llistaModelsTipus(String model) throws LlistesException {
        ArrayList<Model> llista = new ArrayList<>();
        if (llistaModels.isEmpty()) {
            throw new LlistesException("la llista esta buida");
        } else {
            for (Model i : llistaModels) {
                if (i.getClass().getSimpleName().equalsIgnoreCase(model)) {
                    llista.add(i);
                }
            }
        }
        return llista;
    }

    public void eliminarLlistaModel(Model model) {
        if (llistaModels.contains(model)) {
            llistaModels.remove(model);
        } else {
            System.out.println("no esta en la lista de modelos" + model);

        }
    }

}
