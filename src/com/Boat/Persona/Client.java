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
public class Client extends Persona {
    
    private String compteCorrent;
    private TargetaCredit targetaCredit;

    public Client(String compteCorrent, TargetaCredit targetaCredit, String nom, String llinatge, Document document, String numDocument, String adreça, int telefon, String email) {
        super(nom, llinatge, document, numDocument, adreça, telefon, email);
        this.compteCorrent = compteCorrent;
        this.targetaCredit = targetaCredit;
    }

    public String getCompteCorrent() {
        return compteCorrent;
    }

    public void setCompteCorrent(String compteCorrent) {
        this.compteCorrent = compteCorrent;
    }

    public TargetaCredit getTargetaCredit() {
        return targetaCredit;
    }

    public void setTargetaCredit(TargetaCredit targetaCredit) {
        this.targetaCredit = targetaCredit;
    }

    @Override
    public String toString() {
        return super.toString() + "Client{" + "compteCorrent=" + compteCorrent + ", targetaCredit=" + targetaCredit + '}';
    }
    
    
}
