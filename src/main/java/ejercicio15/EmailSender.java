package ejercicio15;

class EmailSender {
    public void enviarBienvenida(UsuarioE15 usuarioE15) {
        // Simulación de envío vía SMTP (por ejemplo con Mailtrap)
        System.out.println("Enviando email a " + usuarioE15.getEmail());
        System.out.println("Asunto: Bienvenido");
        System.out.println("Hola " + usuarioE15.getNombre() + ", gracias por registrarte.");
    }
}
