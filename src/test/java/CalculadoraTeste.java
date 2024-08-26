package test.java;

import org.junit.Test;
import static org.junit.Assert.*;
import main.java.Calculadora;

public class CalculadoraTeste {

    @Test
    public void testeAdicao() {
        Calculadora calculadora = new Calculadora();
        int result = calculadora.add(3, 5);
        assertEquals(8, result);
    }
}
