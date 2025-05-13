package ejercicio14;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistema de Login ===");
        System.out.print("Usuario: ");
        String nombre = scanner.nextLine();
        System.out.print("Contraseña: ");
        String clave = scanner.nextLine();
        var x1 = new Perfil("santiago", "Administrador", "1234");
        var x2 = new Perfil("s", "Usuario", "567");
        var x3 = new Perfil("asd", "Administrador", "890");
        var verificador = new VerificarPerfil(List.of(x1, x2, x3));
        var usuario = new Perfil(nombre, "", clave);
        System.out.println(verificador.revisarRol(usuario));

        scanner.close();
    }
}

