public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("Alice", 1000);
        ContaPoupanca cp = new ContaPoupanca("Bob", 1500);
        ContaSalario cs = new ContaSalario("Carlos", 1200);

        cc.depositar(200);
        cp.sacar(100);
        cs.transferir(cc, 300);

        cc.aplicarJurosDiarios();
        cp.aplicarJurosDiarios();
        cs.aplicarJurosDiarios();

        cc.imprimirExtrato();
        cp.imprimirExtrato();
        cs.imprimirExtrato();
    }
}
// Calculando o resultado:
// saldo: 1000 + 200 = 1200
// saldo: 1500 - 100 = 1400
// cs: 1200 - 300 = 900  cc: 1200 + 300 = 1500
// 1500 * 1.001 = 1501.5
// 1400 * 1.0008 = 1401.12
// 1200 - 300 = 9000