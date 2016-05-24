/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.Boat.Empresa.Empresa;
import com.Boat.Exception.AfegirException;
import com.Boat.Exception.EliminarException;
import com.Boat.Persona.Client;
import com.Boat.Persona.Document;
import com.Boat.Persona.TargetaCredit;
import static jdk.nashorn.internal.objects.NativeRegExp.test;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Elio
 */
public class JunitLlistaClient {
    
    @Test
    public void testAfegirClient() throws AfegirException{
        Empresa test = new Empresa("Test");
        
        TargetaCredit visa1 = new TargetaCredit(0210026542, 12, 2017, 213);
        Client test1 = new Client("test", "test", Document.DNI, "45987546Q", "C/Garriga nº50", 68978516, "bielr@gmail.com","6545");
        Client test2 = new Client("test2", "test2", Document.DNI, "43195118Y", "C/Flor nº14", 625313678, "tomeu@gmail.com", visa1);
        test.afegirClient(test1);
        
        assertEquals("ha anat bé",1,test.getLlistaClient().size());
    }
    
    @Test(expected = AfegirException.class)
    public void testAfegirClientException()throws AfegirException{
        Empresa test = new Empresa("Test");
        Client test1 = new Client("test", "test", Document.DNI, "45987546Q", "C/Garriga nº50", 68978516, "bielr@gmail.com","6545");
        Client test2 = new Client("test", "test", Document.DNI, "45987546Q", "C/Garriga nº50", 68978516, "bielr@gmail.com","6545");
        test.afegirClient(test1);
        test.afegirClient(test2);

    }
    
    public void testEliminarClient() throws EliminarException{
    Empresa test = new Empresa("Test");
        
        TargetaCredit visa1 = new TargetaCredit(0210026542, 12, 2017, 213);
        Client test1 = new Client("test", "test", Document.DNI, "45987546Q", "C/Garriga nº50", 68978516, "bielr@gmail.com","6545");
        Client test2 = new Client("test2", "test2", Document.DNI, "43195118Y", "C/Flor nº14", 625313678, "tomeu@gmail.com", visa1);
        test.eliminarClient("numDocument");
        
        assertEquals("ha anat bé",1,test.getLlistaClient().size());
}
    
    
}
