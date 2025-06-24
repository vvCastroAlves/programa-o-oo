package RPG;

public class Arqueiro extends Personagem {
    public Arqueiro(String nome) {
        super(nome, 120, 15);
    }


    public void atacar(Personagem inimigo) {
        double chanceCritico = Math.random();
        int dano = ataqueBase;
        if (chanceCritico < 0.2) {
            dano *= 2;
            System.out.println("Ataque Crítico!");
        }
        inimigo.defender(dano);
    }


    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usa Chuva de Flechas!");
        // Três ataques de uma vez
    }
}

