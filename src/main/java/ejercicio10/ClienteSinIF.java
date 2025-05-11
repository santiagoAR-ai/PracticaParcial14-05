package ejercicio10;

public class ClienteSinIF {
    private boolean activo;
    private boolean tieneDeuda;

    public ClienteSinIF(boolean activo, boolean tieneDeuda) {
        this.activo = activo;
        this.tieneDeuda = tieneDeuda;
    }


    public void procesarSimplificado() {
        if (!activo) {
            System.out.println("No está activo.");
            return;
        }
        if (!tieneDeuda) {
            System.out.println("Cliente procesado.");
            return;
        }
        System.out.println("Tiene deuda.");
    }
}
