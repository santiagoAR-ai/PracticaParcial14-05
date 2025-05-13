package ejercicio14;

import java.util.Objects;

class Perfil {
    private String nombreUsuario;
    private String rol;
    private String contraseña;

    public Perfil(String nombreUsuario, String rol, String contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.rol = rol;
        this.contraseña = contraseña;
    }

    public String getRol() {
        return rol;
    }

    public String nombre() {
        return nombreUsuario;
    }

    public String contraseña() {
        return contraseña;
    }

    public boolean autenticaCon(Perfil usuario) {
        return Objects.equals(this.nombreUsuario, usuario.nombre()) &&
                Objects.equals(this.contraseña, usuario.contraseña());
    }
}
