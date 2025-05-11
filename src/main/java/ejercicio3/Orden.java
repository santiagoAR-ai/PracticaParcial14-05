package ejercicio3;

public class Orden {
    private int precio;
    private String nombre;

    public Orden(int precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }

    public int procesarPago(int saldo) {
        return saldo - this.precio;
    }
}
