package ejercicio15;

public class UsuarioE15 {
    private String nombre;
    private String email;
    private String password;

    public UsuarioE15(String nombre, String email, String password) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }
}

