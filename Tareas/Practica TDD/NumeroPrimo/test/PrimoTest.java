
import numeroprimo.Primo;
import org.junit.Test;
import static org.junit.Assert.*;

public class PrimoTest {

    @Test
    public void testNumeroPrimo() {
        assertTrue(Primo.esPrimo(7));
    }

    @Test
    public void testNumeroNoPrimo() {
        assertFalse(Primo.esPrimo(6));
    }

    @Test
    public void testNumeroNegativo() {
        assertFalse(Primo.esPrimo(-3));
    }

    @Test
    public void testNumeroGrande() {
        assertTrue(Primo.esPrimo(997));
    }

    @Test
    public void testNumeroCero() {
        assertFalse(Primo.esPrimo(0));
    }
}