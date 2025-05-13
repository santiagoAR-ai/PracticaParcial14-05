package ejercicio13;

public class CuentaBancaria implements OperacionesCuentaBancaria {
    private double saldo;

    @Override
    public void debitar(double monto) {
        this.saldo -= monto;
    }

    @Override
    public void acreditar(double monto) {
        this.saldo += monto;
    }
}
