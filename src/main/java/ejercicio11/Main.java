package ejercicio11;

public class Main {
    public static void main(String[] args) {
        var repo = new RepositorioUsuarios();
        var usuario = new Usuario("sasdas@gmail.com");
        repo.addusuario(usuario);
        repo.buscarPorEmail("sasdas@gmail.com").ifPresent(usuario1 -> System.out.println("El usuario existe"));
    }
}