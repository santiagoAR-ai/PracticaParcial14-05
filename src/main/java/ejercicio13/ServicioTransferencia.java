package ejercicio13;

public class ServicioTransferencia implements Transferir {
    private CuentaBancaria origen;
    private CuentaBancaria destino;

    @Override
    public void transferir(double monto) {
        origen.debitar(monto);
        destino.acreditar(monto);
    }
}

