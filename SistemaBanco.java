package org.example;

import java.util.ArrayList;

public class SistemaBanco {

    private final ArrayList<ContaBancaria> contas = new ArrayList<>();
    private ContaBancaria contaAtual;
    private int contadorContas = 1;

    public void adicionarConta(String titular, String tipo) {

        String numeroGerado = String.format("%04d", contadorContas);
        contadorContas++;

        if (tipo.equalsIgnoreCase("corrente")) {
            contas.add(new ContaCorrente(numeroGerado, titular));
        }
        else if (tipo.equalsIgnoreCase("poupanca")) {
            contas.add(new ContaPoupanca(numeroGerado, titular));
        }
    }

    public boolean selecionarConta(int indice) {
        if (indice >= 0 && indice < contas.size()) {
            contaAtual = contas.get(indice);
            return true;
        }
        return false;
    }

    public boolean executarDeposito(double valor) {
        if (contaAtual != null) {
            return contaAtual.depositar(valor);
        }
        return false;
    }

    public boolean executarSaque(double valor) {
        if (contaAtual != null) {
            return contaAtual.sacar(valor);
        }
        return false;
    }

    public double mostrarSaldo() {
        if (contaAtual != null) {
            return contaAtual.getSaldo();
        }
        return 0;
    }

    public void listarContas() {
        for (int i = 0; i < contas.size(); i++) {
            System.out.println(i + " - Conta: " + contas.get(i).getNumeroConta()
                    + " | Titular: " + contas.get(i).getTitular());
        }
    }
}