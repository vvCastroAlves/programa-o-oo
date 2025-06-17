/**
 * Classe abstrata que representa um funcionário.
 */
public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    /**
     * Exibe os dados do funcionário.
     */
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário Base: " + salarioBase);
    }

    /**
     * Calcula o salário final.
     * @return Salário final do funcionário.
     */
    public abstract double calcularSalario();
}
