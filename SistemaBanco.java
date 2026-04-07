package org.example;

public class SistemaBanco {

    private final ContaBancaria conta;

    public SistemaBanco(ContaBancaria conta) {
        this.conta = conta;
    }

    public boolean executarDeposito(double deposito) {
        return conta.depositar(deposito);
    }

    public boolean executarSaque(double saque) {
        return conta.sacar(saque);
    }

    public double mostrarSaldo() {
        return conta.getSaldo();
    }
}