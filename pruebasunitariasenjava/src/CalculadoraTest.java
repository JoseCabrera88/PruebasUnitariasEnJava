import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest {
    @Test
    public void testSuma() {
        Calculadora calculadora = new Calculadora();
        assertEquals(5, calculadora.suma(2, 3));
        assertEquals(-1, calculadora.suma(-4, 3));
        assertEquals(0, calculadora.suma(0, 0));
    }

    @Test
    public void testResta() {
        Calculadora calculadora = new Calculadora();
        assertEquals(2, calculadora.resta(5, 3));
        assertEquals(-7, calculadora.resta(2, 9));
        assertEquals(0, calculadora.resta(5, 5));
    }

    @Test
    public void testMultiplicacion() {
        Calculadora calculadora = new Calculadora();
        assertEquals(15, calculadora.multiplicacion(3, 5));
        assertEquals(-20, calculadora.multiplicacion(4, -5));
        assertEquals(0, calculadora.multiplicacion(0, 10));
    }

    @Test
    public void testDivision() {
        Calculadora calculadora = new Calculadora();
        assertEquals(2, calculadora.division(6, 3));
        assertEquals(-2, calculadora.division(10, -5));
        assertEquals(0, calculadora.division(0, 5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisionPorCero() {
        Calculadora calculadora = new Calculadora();
        calculadora.division(5, 0);
    }
}
