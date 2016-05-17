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
public class Model {
    
    protected String manega;
    protected String eslora;
    protected String calat;
    protected double preu;

    public Model(String manega, String eslora, String calat, double preu) {
        this.manega = manega;
        this.eslora = eslora;
        this.calat = calat;
        this.preu = preu;
    }

    public String getManega() {
        return manega;
    }

    public void setManega(String manega) {
        this.manega = manega;
    }

    public String getEslora() {
        return eslora;
    }

    public void setEslora(String eslora) {
        this.eslora = eslora;
    }

    public String getCalat() {
        return calat;
    }

    public void setCalat(String calat) {
        this.calat = calat;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    @Override
    public String toString() {
        return "Model{" + "manega=" + manega + ", eslora=" + eslora + ", calat=" + calat + ", preu=" + preu + '}';
    }
    
    
}
