public interface Autenticavel {
    boolean autenticar(String senha);
}

public interface Gerenciavel {
    void alterarSenha(String novaSenha);
    void bloquearUsuario();
}

public interface Logavel {
    void registrarLog(String operacao);
}
