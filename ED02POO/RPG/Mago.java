package RPG;

public class Mago extends Personagem {
    public Mago(String nome) {
        super(nome, 100, 25);
    }


    public void atacar(Personagem inimigo) {
        inimigo.defender(ataqueBase);
    }


    public void usarHabilidadeEspecial() {
        System.out.println(nome + " lança Bola de Fogo!");
        // Simples para fins didáticos, poderia afetar múltiplos inimigos
    }
}
