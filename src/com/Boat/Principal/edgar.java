/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Boat.Principal;

import com.Boat.Persona.Document;
import com.Boat.Persona.Empleat;
import static com.Boat.Persona.Habilitats.VELA;
import static com.Boat.Persona.Habilitats.VIDRE;
import java.util.Date;

/**
 *
 * @author Edgarr
 */
public class edgar {
    
    public static void main(String[] args){
    
    Date dita = new Date();
        
        Empleat yo = new Empleat(dita,1000,10000,"yo","segon",Document.DNI,"432189878j","calle 1",778,"yo@yo.com");
        
        yo.afegirHabilitat(VIDRE);
        yo.afegirHabilitat(VELA);

        System.out.println(yo.mostraHabilitats());
        
        yo.eliminarHabilitat(VIDRE);
        
                System.out.println(yo.mostraHabilitats());
    
    
    
    
    }
    
}
