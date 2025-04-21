public class Jogador {
    public void incrementarTentativas() {
        this.tentativas += 1;
    }
    

    private String nome;
    private int tentativas;
    private int pontuacao;

    public Jogador(String nome) {
        this.nome = nome;
        this.tentativas = 0;
        this.pontuacao = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getTentativas() {
        return tentativas;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTentativas(int tentativas) {
        this.tentativas = tentativas;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public void incrementarTentativa() {
        this.tentativas += 1;
    }

    public void atualizarPontuacao(int valor) {
        this.pontuacao += valor;
    }
}