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
    
    protected float manega;
    protected float eslora;
    protected float calat;
    protected float preu;

    public Model(float manega, float eslora, float calat, float preu) {
        this.manega = manega;
        this.eslora = eslora;
        this.calat = calat;
        this.preu = preu;
    }

    public float getManega() {
        return manega;
    }

    public void setManega(float manega) {
        this.manega = manega;
    }

    public float getEslora() {
        return eslora;
    }

    public void setEslora(float eslora) {
        this.eslora = eslora;
    }

    public float getCalat() {
        return calat;
    }

    public void setCalat(float calat) {
        this.calat = calat;
    }

    public float getPreu() {
        return preu;
    }

    public void setPreu(float preu) {
        this.preu = preu;
    }



    @Override
    public String toString() {
        return "Model{" + "manega=" + manega + ", eslora=" + eslora + ", calat=" + calat + ", preu=" + preu + '}';
    }
    
    
}
