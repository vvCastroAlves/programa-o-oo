package RPG;

public class Guerreiro extends Personagem {
    public Guerreiro(String nome) {
        super(nome, 150, 20);
    }

    @Override
    public void atacar(Personagem inimigo) {
        inimigo.defender(ataqueBase);
    }

    @Override
    public void defender(int dano) {
        super.defender(dano / 2); // Reduz dano pela metade
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usa Golpe Duplo!");
        // Golpe duplo
        ataqueBase *= 2;
    }
}

