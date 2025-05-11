package ejercicio4;

public class ClienteNuevo extends Cliente implements FormaDePago {

    public ClienteNuevo(String nombre, int id) {
        super(nombre, id);
    }

    @Override
    public float aplicarDescuento(int precio) {
        return precio + (precio * 0);
    }

}
