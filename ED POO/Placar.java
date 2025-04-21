import java.util.ArrayList;


public class Placar {
    private ArrayList<Jogador> ranking;

   
    public Placar() {
        ranking = new ArrayList<>();
    }

    /**
     * @param j 
     */
    public void adicionarJogador(Jogador j) {
        ranking.add(j);
    }

    /**
     */
    public void mostrarRanking() {
        System.out.println("\n=== RANKING DE JOGADORES ===");
        

        ranking.sort((j1, j2) -> Integer.compare(j2.getPontuacao(), j1.getPontuacao()));
        
        for (int i = 0; i < ranking.size(); i++) {
            Jogador j = ranking.get(i);
            System.out.println((i + 1) + ". " + j.getNome() + " - " + j.getPontuacao() + " pontos");
        }
        
        System.out.println("===========================");
    }
}