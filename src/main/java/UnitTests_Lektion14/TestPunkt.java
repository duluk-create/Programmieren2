package UnitTests_Lektion14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPunkt {
    int defaultY = 20;
    int defaultX = 234;

    public void testeX(int x){
        try{
            Punkt.verschiebePunkt(x, defaultY);
            fail("Runtime Exception erwartet");
        }catch (RuntimeException e){
            assertEquals("x ist ungültig", e.getMessage());
        }
    }

    public void testeY(int y){
        try{
            Punkt.verschiebePunkt(defaultX, y);
            fail("Runtime Exception erwartet");
        }catch (RuntimeException e){
            assertEquals("y ist ungültig", e.getMessage());
        }
    }

    @Test
    public void testeXyValid(){
        Punkt.verschiebePunkt(234, 943);
        assertTrue(Punkt.x == 234 && Punkt.y == 943);
    }

    @Test
    public void testeXYNegativInvalid(){
        testeX(-2);
        testeY(-33);
    }

    @Test
    public void testeXYPositiveInvalid(){
       testeX(1999);
       testeY(2335);
    }
}
