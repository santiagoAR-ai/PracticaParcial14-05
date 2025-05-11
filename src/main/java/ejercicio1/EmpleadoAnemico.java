package ejercicio1;

public class EmpleadoAnemico {
    private String nombre;
    private String mail;
    private int id;

    public EmpleadoAnemico(String nombre, String mail, int id) {
        this.nombre = nombre;
        this.mail = mail;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
