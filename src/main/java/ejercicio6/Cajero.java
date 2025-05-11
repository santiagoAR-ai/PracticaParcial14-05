package ejercicio6;

public class Cajero {
    private double saldo;

    public Cajero(double saldo) {
        this.saldo = saldo;
    }

    public void retirarSaldo(int monto) {
        if (monto > this.saldo) {
            throw new RuntimeException("No hay suficiente saldo");
        }
        this.saldo -= monto;
    }

}
