/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Boat.Model;

/**
 *
 * @author Toni Dalmau Martínez
 */
public class Veler extends Model {

    private int numCasc;
    private int numPals;
    private int numCabines;

    public Veler(int numCasc, int numPals, int numCabines, String manega, String eslora, String calat, double preu) {
        super(manega, eslora, calat, preu);
        this.numCasc = numCasc;
        this.numPals = numPals;
        this.numCabines = numCabines;
    }

    public int getNumCasc() {
        return numCasc;
    }

    public void setNumCasc(int numCasc) {
        this.numCasc = numCasc;
    }

    public int getNumPals() {
        return numPals;
    }

    public void setNumPals(int numPals) {
        this.numPals = numPals;
    }

    public int getNumCabines() {
        return numCabines;
    }

    public void setNumCabines(int numCabines) {
        this.numCabines = numCabines;
    }

    @Override
    public String toString() {
        return super.toString() + "Veler{" + "numCasc=" + numCasc + ", numPals=" + numPals + ", numCabines=" + numCabines + '}';
    }

}
