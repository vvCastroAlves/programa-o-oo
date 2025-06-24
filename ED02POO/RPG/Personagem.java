package RPG;

public abstract class Personagem {
    protected String nome;
    protected int hp;
    protected int ataqueBase;

    public Personagem(String nome, int hp, int ataqueBase) {
        this.nome = nome;
        this.hp = hp;
        this.ataqueBase = ataqueBase;
    }

    public abstract void atacar(Personagem inimigo);

    public void defender(int dano) {
        this.hp -= dano;
        if (this.hp < 0) this.hp = 0;
    }

    public abstract void usarHabilidadeEspecial();

    public void status() {
        System.out.println(nome + " | HP: " + hp);
    }
}

