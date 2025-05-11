package TestsEjercicios;

import ejercicio5.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEjercicio5 {
    @Test
    public void test1() {
        var calculadora = new Calculadora();
        assertEquals(6, calculadora.sumar(3, 3));
    }
}
