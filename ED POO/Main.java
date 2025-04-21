
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) { 
            System.out.print("Digite o nome do jogador: ");
            String nomeJogador = teclado.nextLine();

            Jogador jogador = new Jogador(nomeJogador);

            jogador.incrementarTentativa();
            jogador.atualizarPontuacao(10);

            System.out.println("Nome: " + jogador.getNome());
            System.out.println("Tentativas: " + jogador.getTentativas());
            System.out.println("Pontuação: " + jogador.getPontuacao());
        } // O Scanner será fechado automaticamente ao final do bloco try-with-resources
    }
}
