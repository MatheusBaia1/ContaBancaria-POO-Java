package org.example;

public class ContaCorrente extends ContaBancaria {
    public ContaCorrente(String numeroConta, String titular) {
        super(numeroConta, titular);
    }
    @Override
    public boolean sacar(double valor) {
        double taxaFixa = 2.50;
        return super.sacar(valor + taxaFixa);
    }
}
