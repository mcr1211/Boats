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

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLlinatge() {
        return llinatge;
    }

    public void setLlinatge(String llinatge) {
        this.llinatge = llinatge;
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

    public void setNumDocument(String numDocument) {
        this.numDocument = numDocument;
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

}
