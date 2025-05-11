package ejercicio11;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RepositorioUsuarios {
    private List<Usuario> lista = new ArrayList<>();

    public Optional<Usuario> buscarPorEmail(String email) {
        return Optional.of(new Usuario(email));
    }

    public void addusuario(Usuario usuario) {
        lista.add(usuario);
    }
}

class Usuario {
    private String email;

    public Usuario(String email) {
        this.email = email;
    }
}

