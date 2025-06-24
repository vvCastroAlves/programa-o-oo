class ContaCorrente extends Conta {
    ContaCorrente(String cliente, double saldoInicial) {
        super(cliente, saldoInicial);
    }

    @Override
    public void aplicarJurosDiarios() {
        saldo *= 1.001; // 0.1% ao dia
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Corrente - Cliente: " + cliente + " | Saldo: " + saldo);
    }
}

