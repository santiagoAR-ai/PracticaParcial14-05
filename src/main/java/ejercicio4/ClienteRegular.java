package ejercicio4;

public class ClienteRegular extends Cliente implements FormaDePago {
    public ClienteRegular(String nombre, int id) {
        super(nombre, id);
    }

    @Override
    public float aplicarDescuento(int precio) {
        return precio + (precio * 0.25f);
    }
}
