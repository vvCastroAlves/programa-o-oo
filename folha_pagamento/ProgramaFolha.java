public class ProgramaFolha {
    public static void main(String[] args) {
        Funcionario carlos = new FuncionarioCLT("Carlos", 2000.0);
        Funcionario ana = new FuncionarioTemporario("Ana", 2000.0);

        carlos.exibirDados();
        System.out.println("Salário Final: " + carlos.calcularSalario());
        System.out.println();

        ana.exibirDados();
        System.out.println("Salário Final: " + ana.calcularSalario());
    }
}
