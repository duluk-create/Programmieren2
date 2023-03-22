package UnitTests_Lektion14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TestStrecke {


    Strecke s = new Strecke(2, 6);
    @Test
    public void testePunkte(){
        assertTrue(s.A <= s.B);
    }
    @Test
    public void testeUeberschneidung() {
        //keine Ueberschneidung
        Strecke s1 = new Strecke(1, 5);
        Strecke s2 = new Strecke(6, 10);
        assertFalse(Strecke.testUeberschnitt(s1, s2));
    }
        @Test
        public void testeIdentische(){
            Strecke identisch = new Strecke();
            Strecke s3 = new Strecke(3, 6);
            Strecke s4 = new Strecke(3, 6);
            assertTrue(identisch.testUeberschnitt(s3, s4));
        }

        @Test
        public void testeUeberschnitt(){
            Strecke ueberschnitt = new Strecke();
            Strecke s5 = new Strecke(1, 9);
            Strecke s6 = new Strecke(3, 15);
            assertTrue(ueberschnitt.testUeberschnitt(s5, s6));
        }



    @Test
    public void testeAusgabe(){
        assertTrue(s.toString().equals(s.A + "-----" + s.B));
    }
}
