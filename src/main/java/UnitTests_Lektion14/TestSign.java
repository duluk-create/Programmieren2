package UnitTests_Lektion14;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestSign {
@Test
    public void testSignOperator(){
    assertTrue(-1 == Sign.sign(-5));
    assertTrue(1 == Sign.sign(5));
    assertTrue(0 == Sign.sign(0));
}
}
