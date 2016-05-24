/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Boat.Principal;

import com.Boat.Empresa.Empresa;
import com.Boat.Exception.AfegirException;
import com.Boat.Exception.LlistesException;
import com.Boat.Exception.RepetitException;
import com.Boat.Model.*;
import com.Boat.Operacions.Estat;
import com.Boat.Operacions.Lloguer;
import com.Boat.Persona.Client;
import com.Boat.Persona.Document;
import com.Boat.Persona.Empleat;
import static com.Boat.Persona.Habilitats.VELA;
import com.Boat.Persona.Patro;
import com.Boat.Persona.TargetaCredit;
import com.Boat.Vaixell.Vaixell;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Edgarr
 */
public class edgar {
    
    public static void main(String[] args) throws LlistesException, ParseException, AfegirException, RepetitException {
       
        
        
        
//        Empleat yo = new Empleat(dita,1000,10000,"yo","segon",Document.DNI,"4321898701j","calle 1",800,"yo@gmail.com");
//        Empleat paula = new Empleat(dita,1000,10000,"paula","segon",Document.DNI,"432189802j","calle 1",801,"paula@gmail.com");

 
//        try {
            
        //yo.afegirHabilitat(VIDRE);
        //yo.afegirHabilitat(VELA);
        //yo.afegirHabilitat(VIDRE);

//        System.out.println(yo.getNom() + " te habilitat: "+ yo.getLlistaHabilitats());
//        
//        yo.mostraHabilitats();
//        
//        } catch(LlistesException e){
//            e.printStackTrace();
//        } //catch (AfegirException e) {
          //  e.printStackTrace();

        //}
        
        
        
        
        //System.out.println(yo.mostraHabilitats());
        
      
        //yo.eliminarHabilitat(VIDRE);
        
        //System.out.println(yo.mostraHabilitats());
        
        
    
        //System.out.println(paula.mostraHabilitats());
    
        
        Iot ancora = new Iot(4,100,100,true,20,290,100,28580);
        Iot malvina = new Iot(7,200,300,true,20,295.8f,100,30000);
        
        Motora motoAquatica1 = new Motora(300,458,true,10,8,1,2800); 
        Motora motoAquatica2 = new Motora(300,458,true,10,8,1,2800); 
        
        Veler interceptor = new Veler(2,8,4,400,300,9,450580);
        Veler humulusErrante = new Veler(8,7,9,480,428,9,550588);
        
        Empresa boatInc = new Empresa("BOATS Inc");
        
        
       boatInc.afegirLlistaModel(ancora);
       boatInc.afegirLlistaModel(malvina);
       boatInc.afegirLlistaModel(motoAquatica1);
       boatInc.afegirLlistaModel(motoAquatica2);
       boatInc.afegirLlistaModel(interceptor);

       //llista de Models Disponibles
       
       //boatInc.tornaLlistaModels();
       
       // llista Models segons el tipus
        boatInc.llistaModelsTipus("Motora");
        boatInc.llistaModelsTipus("Veler");
        
   

       System.out.println(ancora.getClass().getName());
       
       System.out.println(ancora.getClass().getSimpleName());

       
  
       
       //System.out.println(boatInc.getLlistaModels());
       
       /*if(){
        System.out.println("");
       }
       */
       
       
       
       //boatInc.eliminarLlistaModel(motoAquatica2);
        
        
       
       
        Date date = Calendar.getInstance().getTime();
        System.out.println(date);
        
        DateFormat dt = new SimpleDateFormat("dd/MM/yyyy");

      /*
       String dia = "1/03/2016";
       Date dateInput = dt.parse(dia);
       String dia2 = dt.format(dateInput);
       
       System.out.println(dateInput + "otro dia");
       System.out.println(dia2  + "otro dia");

        if(dia == dia2 ){
        System.out.println("son la misma fecha");
        } else {
        System.out.println("no son la misma fecha");

        }
       */ 
       String diaInici = "1/03/2016";
       Date diaIniciDate = dt.parse(diaInici);
       String diaIniciDt = dt.format(diaIniciDate);
       
       String dia = "10/03/2016";
       Date diaDate = dt.parse(dia);
       
       String dia28 = "28/03/2016";
       Date diaDate28 = dt.parse(dia28);
       
       String dia5 = "5/03/2016";
       Date diaDate5 = dt.parse(dia5);
       
       String dia6 = "6/03/2016";
       Date diaDate6 = dt.parse(dia6);
              
       String dia7 = "7/03/2016";
       Date diaDate7 = dt.parse(dia7);
       
       String dia8 = "8/03/2016";
       Date diaDate8 = dt.parse(dia8);
       String diaDt8 = dt.format(diaDate8);
       
       Vaixell vaixell1 = new Vaixell("Feadship",ancora,"6ª-TA-2-010-12","BOATS INC",true,diaIniciDate,Estat.ACABAT,200.50);
       Vaixell vaixell2 = new Vaixell("Yamaha",motoAquatica1,"6ª-TA-3/12","BOATS INC",false,diaDate8,Estat.ACABAT,75);
       Vaixell vaixell3 = new Vaixell("Jeanneau",interceptor,"6ª-TA-058-16","BOATS INC",true,diaDate7,Estat.PENDENT,0);
       Vaixell vaixell4 = new Vaixell("Zuzuki",motoAquatica1,"6ª-JY-3/12","BOATS INC",true,diaDate8,Estat.ACABAT,75);

        
        TargetaCredit visa  = new TargetaCredit(23,5,5,10);
        
        Client client2 = new Client("nom", "llinatges", Document.DNI,"4321412","palma",6712374,"client2@gmail.com",visa);
            
        Patro patro1 = new Patro("losa","las",Document.PASSAPORT,"102938741243","palma2",1029384,"losa@gmail","Magisterio",300);
            
        Lloguer lloguer1 = new Lloguer(diaIniciDate,diaDate,patro1,vaixell1,200000,Estat.ACABAT,client2,1);
        //Lloguer lloguer2 = new Lloguer(diaIniciDate,diaDate,patro1,vaixell1,200000,Estat.ACABAT,client2,1);

        // llogado el vaixell1 true del 1 al 10
        // vaixell4 no esta llogado y true esta desde 8
        
       
        boatInc.afegirVaixell(vaixell1);
        boatInc.afegirVaixell(vaixell2);
        boatInc.afegirVaixell(vaixell3);
        boatInc.afegirVaixell(vaixell4);
 
        boatInc.afegirLloguer(lloguer1);
        System.out.println(boatInc.getLlistaLloguer());        
       
        System.out.println("lista de disponibles -------------");
        boatInc.llistaEmbDisponibles(diaDate5,diaDate);
        System.out.println("lista de disponibles -------------");


        

        
        
        
        
        
//        
       
       
        //System.out.println(boatInc.getLlistaLloguer());
        
            
            
            
            //boatInc.llistesModelsDisponibles();
                  
            
        
        
    }      
                
                }
