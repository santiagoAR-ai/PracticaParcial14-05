package ejercicio4;

public class ClientePremiun extends Cliente implements FormaDePago {
    public ClientePremiun(String nombre, int id) {
        super(nombre, id);
    }

    @Override
    public float aplicarDescuento(int precio) {
        return precio + (precio * 0.50f);
    }
}
