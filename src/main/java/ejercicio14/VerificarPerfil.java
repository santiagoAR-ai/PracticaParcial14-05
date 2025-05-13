package ejercicio14;

import java.util.List;

public class VerificarPerfil implements comprobarPerfil {
    private static final String LOGINEXITOSO = "Bienvenido";
    private static final String LOGINFRACASO = "Credenciales inválidas";
    private List<Perfil> perfilList;

    public VerificarPerfil(List<Perfil> perfilList) {
        this.perfilList = perfilList;
    }

    @Override
    public String revisarRol(Perfil usuario) {
        return perfilList.stream()
                .filter(perfil -> perfil.autenticaCon(usuario))
                .findFirst()
                .map(p -> LOGINEXITOSO)
                .orElse(LOGINFRACASO);
    }
}
