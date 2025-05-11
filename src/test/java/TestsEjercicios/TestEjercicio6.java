package TestsEjercicios;

import ejercicio6.Cajero;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestEjercicio6 {
    @Test
    public void test01() {
        var cajero = new Cajero(1000);
        assertThrows(RuntimeException.class, () -> {
            cajero.retirarSaldo(2000);
        });
    }
}
