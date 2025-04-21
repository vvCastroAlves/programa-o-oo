import java.util.Random;

public class Jogo {
    private Jogador jogador;
    private int numeroSecreto;

    public Jogo(Jogador jogador) {
        this.jogador = jogador;

        Random rand = new Random();
        this.numeroSecreto = rand.nextInt(100) + 1;
    }

    public String jogar(int tentativa) {
        jogador.incrementarTentativas(); // Agora chamando corretamente o método na classe `Jogador`

        if (tentativa < numeroSecreto) {
            return "O número secreto é MAIOR.";
        } else if (tentativa > numeroSecreto) {
            return "O número secreto é MENOR.";
        } else {
            int pontos = calcularPontuacao();
            jogador.atualizarPontuacao(pontos);
            return "PARABÉNS! Você ACERTOU o número secreto " + numeroSecreto + "!\n" +
                   "Você fez " + pontos + " pontos nesta rodada.";
        }
    }

    private int calcularPontuacao() {
        int pontos = 100 - jogador.getTentativas() * 10;
        return Math.max(10, pontos);
    }

    public int getNumeroSecreto() {
        return numeroSecreto;
    }
}