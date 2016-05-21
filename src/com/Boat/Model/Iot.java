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
public class Iot extends Model {
    
    private int numCamarot;
    private int potenciaMotor;
    private int autonomia;
    private boolean bodega;

    public Iot(int numCamarot, int potenciaMotor, int autonomia, boolean bodega, float manega, float eslora, float calat, float preu) {
        super(manega, eslora, calat, preu);
        this.numCamarot = numCamarot;
        this.potenciaMotor = potenciaMotor;
        this.autonomia = autonomia;
        this.bodega = bodega;
    }

    public int getNumCamarot() {
        return numCamarot;
    }

    public void setNumCamarot(int numCamarot) {
        this.numCamarot = numCamarot;
    }

    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public boolean isBodega() {
        return bodega;
    }

    public void setBodega(boolean bodega) {
        this.bodega = bodega;
    }

    @Override
    public String toString() {
        return super.toString() + "Iot{" + "numCamarot=" + numCamarot + ", potenciaMotor=" + potenciaMotor + ", autonomia=" + autonomia + ", bodega=" + bodega + '}';
    }
    
    
}
