/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Boat.Principal;

import com.Boat.Empresa.Empresa;
import com.Boat.Empresa.streams.eines.EinesObjectStream;
import com.Boat.Exception.AfegirException;
import com.Boat.Exception.BoatException;
import com.Boat.Exception.EliminarException;
import com.Boat.Exception.LlistesException;
import com.Boat.Exception.PersonaException;
import com.Boat.Exception.HabilitatExeception;
import com.Boat.Model.Iot;
import com.Boat.Model.Model;
import com.Boat.Model.Motora;
import com.Boat.Model.Veler;
import com.Boat.Operacions.Estat;
import com.Boat.Operacions.Lloguer;
import com.Boat.Persona.Client;
import com.Boat.Persona.Comercial;
import com.Boat.Persona.Document;
import com.Boat.Persona.Empleat;
import com.Boat.Persona.Habilitats;
import com.Boat.Persona.Patro;
import com.Boat.Persona.Persona;
import com.Boat.Persona.Taller;
import com.Boat.Persona.TargetaCredit;
import com.Boat.Vaixell.Vaixell;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author toni Dalmau Martínez
 */
public class Main {

    public Empresa inici(){
               Empresa boatInc = new Empresa("BOATS Inc");
        try{
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        String data = "1-05-2016";
//        Date d1 = sdf.parse(data);
        Date d1=null;
        
       DateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
       String dia1 = "1/03/2016";
       Date dia1Date = dt.parse(dia1);
              
       String dia5 = "5/03/2016";
       Date diaDate5 = dt.parse(dia5);
       
       String dia6 = "6/03/2016";
       Date diaDate6 = dt.parse(dia6);
              
       String dia7 = "7/03/2016";
       Date diaDate7 = dt.parse(dia7);
       
       String dia8 = "8/03/2016";
       Date diaDate8 = dt.parse(dia8);
       
       String dia10 = "10/03/2016";
       Date diaDate10 = dt.parse(dia10);
    
        String dia28 = "28/03/2016";
       Date diaDate28 = dt.parse(dia28);
        
        
       
        Taller toni = new Taller(d1, 900, "Toni", "Dalmau", Document.DNI, "43194116R", "C/ Sol nº5", 620354389, "tonid@gmail.com");
        Taller miquel = new Taller(d1, 900, "Miquel", "Abrines", Document.DNI, "98125369Z", "C/Plutó nº1", 620136987, "miquelabri@gmail.com");
        Taller sise = new Taller(d1, 900, "Sise", "Donea", Document.DNI, "11111111K", "C/ palma", 620354789, "sise@gmail.com");
        Taller ons = new Taller(d1, 900, "Ons", "Monaeritesea", Document.DNI, "11111110k", "C/ palma altre", 620132345, "monaeritesea@gmail.com");
        
        boatInc.afegirTaller(miquel);
        boatInc.afegirTaller(toni);
        boatInc.afegirTaller(sise);
        boatInc.afegirTaller(ons);
    
        Comercial tomas = new Comercial (10,d1,1600,"Tomeu","Boto", Document.NIE, "46523154K","c/mar nº99",689745200,"tomeu@boto.com");
        Comercial edgar = new Comercial(10, d1, 1499, "Edgar", "Robayo", Document.DNI, "43195117T", "C/Lluna nº7", 621354388, "edgar@gmail.com");
        Comercial ans = new Comercial (10,d1,1600,"Ans","mela", Document.NIE, "46523154K","c/mar nº89",689745200,"ans@boto.com");
        Comercial mectilea = new Comercial(10, d1, 1499, "Mectilea", "Ans", Document.DNI, "43197890T", "C/Marte nº7", 621354389, "mectilea@gmail.com");
        
        
        boatInc.afegirComercial(tomas);
        boatInc.afegirComercial(edgar);
        boatInc.afegirComercial(ans);
        boatInc.afegirComercial(mectilea); 


        TargetaCredit visa1 = new TargetaCredit(0210026542, 12, 2017, 213);
        TargetaCredit visa2 = new TargetaCredit(0213026542, 12, 2017, 513);
        TargetaCredit visa3  = new TargetaCredit(0213026575, 12, 2017, 513);
        TargetaCredit visa4  = new TargetaCredit(0213026577, 12, 2017, 291);

        Client tomeu = new Client("Tome", "Morro", Document.DNI, "43195118Y", "C/Flor nº14", 625313678, "tomeu@gmail.com", visa1);
        Client biel = new Client("Biel", "Recio", Document.DNI, "45987546Q", "C/Garriga nº50", 68978516, "bielr@gmail.com", "ES210036");
        Client paco = new Client("Paco", "Paquito", Document.PASSAPORT, "498795465W", "c/mar nº9", 69876216, "paco@paquito.com", "ES362145", visa2);
        Client tera = new Client("Tera", "Mec", Document.DNI, "89195118Y", "C/Mace nº14", 625313689, "tomeu@gmail.com", visa3);

        boatInc.afegirClient(biel);
        boatInc.afegirClient(tomeu);
        boatInc.afegirClient(paco);
        boatInc.afegirClient(tera);
        
        
        //Models
        Iot ancora = new Iot(4, 100, 100, true, 20, 290, 100, 28580);
        Iot malvina = new Iot(7, 200, 300, true, 20, 295.8f, 100, 30000);
        
        Motora motoAquatica1 = new Motora(300, 458, true, 10, 8, 1, 2800);
        Motora motoAquatica2 = new Motora(300, 458, true, 10, 8, 1, 2800);
        
        Veler interceptor = new Veler(2, 8, 4, 400, 300, 9, 450580);
        Veler humulusErrante = new Veler(8, 7, 9, 480, 428, 9, 550588);
        
       boatInc.afegirLlistaModel(ancora);
       boatInc.afegirLlistaModel(malvina);
       boatInc.afegirLlistaModel(motoAquatica1);
       boatInc.afegirLlistaModel(motoAquatica2);
       boatInc.afegirLlistaModel(interceptor);
       boatInc.afegirLlistaModel(humulusErrante);
  
       
       System.out.println("Llista de tots el models");
       
       
       
       //Per el catàleg web necessitam tornar una llista amb tots els models que 
       //tenim disponible, una altra filtrada per tipus d'embarcació i un altre per interval de preu.
       
       boatInc.tornaLlistaModels();
       
       
       
       
       // llista Models segons el tipus
       
       
        boatInc.llistaModelsTipus("Motora");
        boatInc.llistaModelsTipus("Veler");
        
       //boatInc.eliminarLlistaModel(motoAquatica2);

       
       Vaixell vaixell1 = new Vaixell("Feadship",ancora,"6ª-TA-2-010-12","BOATS INC",true,dia1Date,Estat.ACABAT,200.50);
       Vaixell vaixell2 = new Vaixell("Yamaha",motoAquatica1,"6ª-TA-3/12","BOATS INC",false,diaDate8,Estat.ACABAT,75);
       Vaixell vaixell3 = new Vaixell("Jeanneau",interceptor,"6ª-TA-058-16","BOATS INC",true,diaDate7,Estat.PENDENT,0);
       Vaixell vaixell4 = new Vaixell("Zuzuki",motoAquatica1,"6ª-JY-3/12","BOATS INC",true,diaDate8,Estat.ACABAT,75);

        
        boatInc.afegirVaixell(vaixell1);
        boatInc.afegirVaixell(vaixell2);
        boatInc.afegirVaixell(vaixell3);
        boatInc.afegirVaixell(vaixell4);

        Patro marcus = new Patro("Marcus", "Demian", Document.PASSAPORT, "1654916054O", "", 33512686, "marcus@yahoo.fr", "Capitán Navio", 300);
        Patro patro1 = new Patro("losa","las",Document.PASSAPORT,"102938741243","palma2",1029384,"losa@gmail","Magisterio",300);

        
        Client client2 = new Client("Mosa", "Line", Document.DNI,"4321412","palma",6712374,"client2@gmail.com",visa3);
            
            
        Lloguer lloguer1 = new Lloguer(dia1Date,diaDate10,patro1,vaixell1,200000,Estat.ACABAT,client2,1);
        //Lloguer lloguer2 = new Lloguer(dia1Date,diaDate10,patro1,vaixell1,200000,Estat.ACABAT,client2,1);
        
 
        boatInc.afegirLloguer(lloguer1);
        System.out.println(boatInc.getLlistaLloguer());        
       
        System.out.println("lista de disponibles -------------");
        boatInc.llistaEmbDisponibles(diaDate5,diaDate10);
        System.out.println("lista de disponibles -------------");

        
        
        
        
        
        return boatInc;

        }catch(BoatException ex){
            System.out.println(ex.getMessage());
//        }catch(LlistesException lli){
//            System.out.println(lli.getMessage());
//        }catch(){
//        
    }finally{
            return boatInc;
        }

}
    
    
    public void llegeixFitxer(String desti) throws IOException{
        EinesObjectStream.llegeixObjecte(desti);
    }
    
    public void guardarFitxer(String desti) throws IOException{
        EinesObjectStream.escriuObjecte(desti, this);
    }
    
   public static void main(String[] args) throws BoatException, EliminarException, PersonaException, LlistesException, AfegirException, ParseException  {
        String desti="C:\\Users\\BoatsInc\\Documents\\Dades.odt";
        Main main = new Main();
        Empresa boat = main.inici();
 
        
       
    }
}