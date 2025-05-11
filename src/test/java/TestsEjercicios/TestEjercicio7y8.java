package TestsEjercicios;

import ClasesFakes.ServiceMailFakes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEjercicio7y8 {
    @Test
    public void test01() {
        var serviceMail = new ServiceMailFakes();
        serviceMail.enviarCorreo("angus@acdc.com", "Feliz Cumpleaños", "Enhorabuena por tu cumpleaños :D");
        assertEquals("angus@acdc.com - Feliz Cumpleaños: Enhorabuena por tu cumpleaños :D", serviceMail.mail());

    }
}
