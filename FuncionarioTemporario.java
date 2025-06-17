/**
 * Funcionário Temporário que tem desconto fixo de R$100,00.
 */
public class FuncionarioTemporario extends Funcionario {
    public FuncionarioTemporario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase - 100;
    }
}
