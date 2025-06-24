public class Cliente extends Usuario implements Autenticavel {
    public Cliente(String login, String senha) {
        super(login, senha);
    }

    @Override
    public boolean autenticar(String senha) {
        return senha.equals(this.senha) && senha.length() > 6;
    }
}
