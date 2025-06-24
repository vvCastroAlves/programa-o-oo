class ContaPoupanca extends Conta {
    ContaPoupanca(String cliente, double saldoInicial) {
        super(cliente, saldoInicial);
    }

    @Override
    public void aplicarJurosDiarios() {
        saldo *= 1.0008; // 0.08% ao dia
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Poupança - Cliente: " + cliente + " | Saldo: " + saldo);
    }
}

