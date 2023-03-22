package UnitTests_Lektion14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestKugelvolumen {
    Kugelvolumen test = new Kugelvolumen();

    @Test
    public void testeVolumen() {
        assertEquals(0, test.berechneKugelvolumen(0));
        assertEquals(4.0 / 3.0 * Math.PI, test.berechneKugelvolumen(1));
        assertEquals(500.0 / 3.0 * Math.PI, test.berechneKugelvolumen(5));
        //   assertEquals(-4.0/3.0*Math.PI, test.berechneKugelvolumen(-1));
    }

    @Test
    public void testeNegativesVolumen() {
        try {
            test.berechneKugelvolumen(-1);
            fail("Runtime Exception erwartet");
        } catch (RuntimeException e) {
            assertEquals("Wert kleiner 0", e.getMessage());
        }
    }
}