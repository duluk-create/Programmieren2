package UnitTests_Lektion14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Strecke {
    int A;
    int B;


    Strecke(){

    }

    public Strecke(int a, int b){
        if(a > b){
            A = b;
            B = a;
        }else{
            A = a;
            B = b;
        }
    }

    public static boolean testUeberschnitt(Strecke a, Strecke b){
        int gleiche = 0;
        ArrayList erste = new ArrayList();
        ArrayList zweite = new ArrayList();

        for (int i = 0; i < a.B-a.A; i++) erste.add(a.A+i);


        for (int i = 0; i < b.B - b.A; i++) zweite.add(b.A+i);

        for (int i = 0; i < erste.size(); i++) {
            if(zweite.contains(erste.get(i))){
                gleiche++;
            }
        }

        return gleiche > 1;
    }

    @Override
    public String toString() {
        String output = "";

        output = output + A;
        for (int i = 0; i <= B-A; i++) {
            output = output + "-";
        }

        if(A != B){
            output = output + B;
        }

        return output;
    }



}
