package ejercicio15;

class RegistroService {
    private RepositorioUsuarios repositorio;
    private Logger logger;
    private EmailSender emailSender;

    public RegistroService(RepositorioUsuarios repo, Logger log, EmailSender sender) {
        this.repositorio = repo;
        this.logger = log;
        this.emailSender = sender;
    }

    public void registrar(UsuarioE15 usuarioE15) {
        repositorio.guardar(usuarioE15);
        logger.log("Registrado: " + usuarioE15.getEmail());
        emailSender.enviarBienvenida(usuarioE15);
    }
}
