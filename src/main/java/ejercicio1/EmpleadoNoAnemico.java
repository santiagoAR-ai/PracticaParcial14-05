package ejercicio1;

public class EmpleadoNoAnemico {
    private String nombre;
    private String mail;
    private int id;
    private boolean posibleAscenso;
    private int saldo;

    public EmpleadoNoAnemico(String nombre, String mail, int id, boolean posibleAscenso, int saldo) {
        this.nombre = nombre;
        this.mail = mail;
        this.id = id;
        this.posibleAscenso = posibleAscenso;
        this.saldo = saldo;
    }

    public int calcularSueldoconBono(int bono) {
        return this.saldo + bono;
    }

    public boolean esElegibleParaAscenso() {
        return posibleAscenso;
    }

}
