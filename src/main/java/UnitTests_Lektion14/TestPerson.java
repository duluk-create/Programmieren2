package UnitTests_Lektion14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestPerson {

    @Test
    public void testeValidPerson(){
        Person eins = new Person("Hansi", "Peter", "Biergasse", "5a", "32243", "Blaufelden");
    }

    @Test
    public void testeInvalidPerson(){
       try{
        Person vornameFalsch = new Person("susi", "Peter", "Biergasse", "6", "32243", "Blaufelden");
        fail("Runtime Exception erwartet");
       }catch (RuntimeException e){
           assertEquals("Verwendung von Kleinbuchstaben", e.getMessage());
       }

        try{
            Person strasseFalsch = new Person("Strolch", "Müller", "pfarrgasse", "28", "34344", "Düren");
            fail("Runtime Exception erwartet");
        }catch (RuntimeException e){
            assertEquals("Verwendung von Kleinbuchstaben", e.getMessage());
        }

        try{
            Person ortFalsch = new Person("Ronnie", "Rockel", "Blaufelder-Straße", "12", "24323", "lüzerat");
            fail("Runtime Exception erwartet");
        }catch (RuntimeException e){
            assertEquals("Verwendung von Kleinbuchstaben", e.getMessage());
        }


        try{
            Person hnrFalsch = new Person("Max", "Muster", "Musterstrasse", "A71", "9328", "Kirchheim");
            fail("Runtime Exception erwartet");
        }catch (RuntimeException e){
            assertEquals("Hausnummer beginnt mit keiner Zahl", e.getMessage());
        }
    }
}
