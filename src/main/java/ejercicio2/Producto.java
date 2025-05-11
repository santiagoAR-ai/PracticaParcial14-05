package ejercicio2;

public class Producto {
    private String nombre;
    private int stock;
    private float precio;

    public Producto(String nombre, int stock, float precio) {
        validarProducto(nombre, stock, precio);
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }

    private void validarProducto(String nombre, int stock, float precio) {
        if (nombre.isBlank()) {
            throw new RuntimeException("Ingrese un nombre");
        }
        if (stock < 0) {
            throw new RuntimeException("Ingrese un stock valido");
        }
        if (precio < 0) {
            throw new RuntimeException("Ingrese un precio valido");
        }
    }


}
