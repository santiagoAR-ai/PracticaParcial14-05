package ejercicio10;

public class ClienteConIF {
    private boolean activo;
    private boolean tieneDeuda;

    public void procesar() {
        // TODO: Simplificar esta lógica usando early return
        if (activo) {
            if (!tieneDeuda) {
                System.out.println("Cliente procesado.");
            } else {
                System.out.println("Tiene deuda.");
            }
        } else {
            System.out.println("No está activo.");
        }
    }
}
