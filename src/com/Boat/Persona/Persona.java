/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Boat.Persona;

import com.Boat.Exception.PersonaException;
import java.util.Objects;

/**
 *
 * @author Toni Dalmau Martínez
 */
public class Persona {

    protected String nom;
    protected String llinatge;
    protected Document document;
    protected String numDocument;
    protected String adreça;
    protected int telefon;
    protected String email;

    public Persona(String nom, String llinatge, Document document, String numDocument, String adreça, int telefon, String email) {
        this.nom = nom;
        this.llinatge = llinatge;
        this.document = document;
        this.numDocument = numDocument;
        this.adreça = adreça;
        this.telefon = telefon;
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) throws PersonaException {
        if("".equals(nom)){
            throw new PersonaException("Falta el nom de la persona.");
        }else {
            this.nom=nom;
        }
    }

    public String getLlinatge() {
        return llinatge;
    }

    public void setLlinatge(String llinatge) throws PersonaException {
        if("".equals(llinatge)){
            throw new PersonaException("Falta el llinatge de la persona.");
        }else {
            this.llinatge = llinatge;
        }
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public String getNumDocument() {
        return numDocument;
    }

    public void setNumDocument(String numDocument) throws PersonaException {
        if("".equals(numDocument)){
            throw new PersonaException("Falta el número de document de la persona.");
        }else{
            this.numDocument=numDocument;
        }
    }

    public String getAdreça() {
        return adreça;
    }

    public void setAdreça(String adreça) {
        this.adreça = adreça;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" + "nom=" + nom + ", llinatge=" + llinatge + ", document=" + document + ", numDocument=" + numDocument + ", adre\u00e7a=" + adreça + ", telefon=" + telefon + ", email=" + email + '}';
    }

    @Override
    public boolean equals(Object obj) {
        
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.numDocument, other.numDocument)) {
            return false;
        }
        return true;
    }

    
}
