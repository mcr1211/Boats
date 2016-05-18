/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Boat.Principal;

import com.Boat.Empresa.Empresa;
import com.Boat.Persona.Client;
import com.Boat.Persona.Document;
import com.Boat.Persona.Patro;
import com.Boat.Persona.Persona;
import com.Boat.Persona.TargetaCredit;
import java.util.HashMap;
import java.util.Map;

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
        
        Patro pat1 = new Patro("tofol","colom",Document.DNI,"123123d","c/sol",2314,"tofol@colom.com","patro de yate",201);
        
        System.out.println(pat1);
        
        Map <String,Persona> mp = new HashMap<String,Persona>();
        Persona p = new Persona("toni","dalmau",Document.DNI,"123123k","c/sol",1249,"toni@dalmau.com");
        mp.put("123123k",p);
        p = new Persona("elio","camison",Document.DNI,"321321k","c/ca",9999,"elio@camison.com");
        mp.put("321321k", p);
        System.out.println("Persones a nes mapa: \n"+mp.toString());
    }
    
}
