package ejercicio9;

public class ReporteVentasRefactorizado {
    private static void generarImporte() {
        System.out.println("Generando importe final");
    }

    private static void procesarDatos() {
        System.out.println("Procesando datos");
    }

    private static void cargarDatos() {
        System.out.println("Cargando datos");
    }

    public void generarReporte() {
        cargarDatos();
        procesarDatos();
        generarImporte();
    }
}
