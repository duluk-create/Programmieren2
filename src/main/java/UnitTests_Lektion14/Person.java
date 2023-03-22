package UnitTests_Lektion14;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Character.isLowerCase;

public class Person {
    String vorname;
    String nachname;
    private ArrayList adresse;


    public Person(String vorname, String nachname, String strasse, String hausnummer, String plz, String ort){
        if(isLowerCase(vorname.charAt(0)) || isLowerCase(strasse.charAt(0)) || isLowerCase(ort.charAt(0))) throw new RuntimeException("Verwendung von Kleinbuchstaben");
        else{
            this.vorname = vorname;
        }
        if(!Character.isDigit(hausnummer.charAt(0))) throw new RuntimeException("Hausnummer beginnt mit keiner Zahl");

        this.nachname = nachname;
        adresse = new ArrayList(Arrays.asList(strasse, hausnummer, plz, ort));
    }

}
