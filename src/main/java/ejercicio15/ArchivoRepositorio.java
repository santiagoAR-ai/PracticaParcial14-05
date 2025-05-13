package ejercicio15;

import java.io.FileWriter;
import java.io.IOException;

class ArchivoRepositorio implements RepositorioUsuarios {
    public void guardar(UsuarioE15 usuarioE15) {
        try (FileWriter fw = new FileWriter("usuarios.txt", true)) {
            fw.write(usuarioE15.getEmail() + ";" + usuarioE15.getNombre() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
