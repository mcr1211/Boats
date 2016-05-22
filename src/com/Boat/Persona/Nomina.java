/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Boat.Persona;

import com.Boat.Persona.Comercial;
import com.Boat.Exception.NominaException;
import com.Boat.Operacions.Venda;
import java.util.ArrayList;

/**
 *
 * @author Toni Dalmau Martínez
 */
public class Nomina {

    private double sou;
    private int comisio;
    private int irpf = 4;
    private double totalDeduir;
    private double totalRetencio;
    private double liquidacio;

    public double calcularNomina(Empleat empleat) throws NominaException {
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
}
