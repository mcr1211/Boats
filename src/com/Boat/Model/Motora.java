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
public class Motora extends Model{
    
    private int potencia;
    private int volumDiposit;
    private boolean motorAuxiliar;

    public Motora(int potencia, int volumDiposit, boolean motorAuxiliar, String manega, String eslora, String calat, double preu) {
        super(manega, eslora, calat, preu);
        this.potencia = potencia;
        this.volumDiposit = volumDiposit;
        this.motorAuxiliar = motorAuxiliar;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getVolumDiposit() {
        return volumDiposit;
    }

    public void setVolumDiposit(int volumDiposit) {
        this.volumDiposit = volumDiposit;
    }

    public boolean isMotorAuxiliar() {
        return motorAuxiliar;
    }

    public void setMotorAuxiliar(boolean motorAuxiliar) {
        this.motorAuxiliar = motorAuxiliar;
    }

    @Override
    public String toString() {
        return super.toString() + "Motora{" + "potencia=" + potencia + ", volumDiposit=" + volumDiposit + ", motorAuxiliar=" + motorAuxiliar + '}';
    }
    
    
    
}
