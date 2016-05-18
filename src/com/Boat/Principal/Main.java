/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Boat.Principal;

import com.Boat.Persona.Client;
import com.Boat.Persona.Document;
import com.Boat.Persona.TargetaCredit;

/**
 *
 * @author Toni Dalmau Martínez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TargetaCredit visa  = new TargetaCredit(23,5,5,10);
        Client num1 = new Client("pep","misto",Document.DNI,"4564554f","c/sol",12345,"pep@misto.com",visa);
        
        System.out.println(num1);
        
    }
    
}
