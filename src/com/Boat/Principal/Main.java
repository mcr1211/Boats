/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Boat.Principal;

import com.Boat.Empresa.Empresa;
import com.Boat.Exception.AfegirException;
import com.Boat.Exception.BoatException;
import com.Boat.Exception.EliminarException;
import com.Boat.Exception.LlistesException;
import com.Boat.Exception.PersonaException;
import com.Boat.Exception.habilitatException;
import com.Boat.Model.Iot;
import com.Boat.Model.Model;
import com.Boat.Model.Motora;
import com.Boat.Model.Veler;
import com.Boat.Operacions.Estat;
import com.Boat.Persona.Client;
import com.Boat.Persona.Comercial;
import com.Boat.Persona.Document;
import com.Boat.Persona.Habilitats;
import com.Boat.Persona.Patro;
import com.Boat.Persona.Persona;
import com.Boat.Persona.Taller;
import com.Boat.Persona.TargetaCredit;
import com.Boat.Vaixell.Vaixell;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Toni Dalmau Martínez
 */
public class Main {

    
    
    
//    public Empresa inici()throws BoatException,EliminarException,LlistesException,PersonaException,habilitatException,AfegirException, ParseException{
//        
//        Empresa BoatInc = new Empresa("BOATS Inc");
//        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
//        String data="1-05-2016";
//        Date d1 = sdf.parse(data);
//        
//        Taller Toni = new Taller(d1,999.99,"Toni","Dalmau",Document.DNI,"43194116R","C/ Sol nº5",620354389,"tonid@gmail.com",Habilitats.MECANICA);
//        
//        Comercial Edgar = new Comercial(10,d1,1499.99,"Edgar","Robayo",Document.DNI,"43195117T","C/Lluna nº7",621354388,"edgar@gmail.com");
//        
//        BoatInc.afegirComercial(Edgar);
//        BoatInc.afegirTaller(Toni);
//        
//        TargetaCredit visa = new TargetaCredit(0210026542,12,2017,213);
//        
////        Client Tomeu = new Client("Tome","Morro",Document.DNI,43195118Y,"C/Flor nº14",625313678,"tomeu@gmail.com",visa);
////        Client Biel = new Client("Biel","Recio",Document.DNI,"45987546Q","C/Garriga nº50","bielr@gmail.com","ES210036");
//        
//        //Models
//        Iot Ancora = new Iot(4,100,100,true,20,290,100,28580);
//        Iot Malvina = new Iot(7,200,300,true,20,295.8f,100,30000);
//        
//        Motora motoAquatica1 = new Motora(300,458,true,10,8,1,2800); 
//        Motora motoAquatica2 = new Motora(300,458,true,10,8,1,2800); 
//        
//        Veler interceptor = new Veler(2,8,4,400,300,9,450580);
//        Veler humulusErrante = new Veler(8,7,9,480,428,9,550588);
//        
//        Vaixell vaixell1 = new Vaixell("Feadship",Ancora,"6ª-TA-2-010-12","BOATS INC",true,d1,Estat.ACABAT,200.50);
//        Vaixell vaixell2 = new Vaixell("Yamaha",motoAquatica1,"6ª-TA-3/12","BOATS INC",false,d1,Estat.ACABAT,75);
//        Vaixell vaixell3 = new Vaixell("Jeanneau",interceptor,"6ª-TA-058-16","BOATS INC",false,d1,Estat.PENDENT,0);
//        
//        BoatInc.afegirVaixell(vaixell1);
//        BoatInc.afegirVaixell(vaixell2);
//        BoatInc.afegirVaixell(vaixell3);
//        
//        Patro Marcus = new Patro("Marcus","Demian",Document.PASSAPORT,"1654916054O","",33512686,"marcus@yahoo.fr","Capitán Navio",300);
//    }
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
        Persona p = new Persona("toni","dalmau",Document.DNI,"123123k","c/sol",1249,"toni@dalmau.com"+"\n");
        mp.put("123123k",p);
        p = new Persona("elio","camison",Document.DNI,"321321k","c/ca",9999,"elio@camison.com"+"\n");
        mp.put("321321k", p);
        System.out.println(mp.toString());
        
        // Objectes Vaixell
//        Model model1 = new Model("25","3","9",3.5);
//        Vaixell zodiac = new Vaixell("Zodiac",model1,"215","Toni",);
    }
    
}
