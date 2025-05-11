package ClasesFakes;

import ejercicio7y8.IMailService;

public class ServiceMailFakes implements IMailService {
    private String mail;

    @Override
    public void enviarCorreo(String destinatario, String asunto, String mensaje) {
        this.mail = destinatario + " - " + asunto + ": " + mensaje;
    }

    public String mail() {
        return this.mail;
    }

}
