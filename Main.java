package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SistemaBanco sistema = new SistemaBanco();

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Criar Conta Corrente");
            System.out.println("2 - Criar Conta Poupança");
            System.out.println("3 - Listar Contas");
            System.out.println("4 - Selecionar Conta");
            System.out.println("5 - Depositar");
            System.out.println("6 - Sacar");
            System.out.println("7 - Ver Saldo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Titular: ");
                    String titularCorrente = scanner.nextLine();

                    sistema.adicionarConta(titularCorrente, "corrente");
                    System.out.println("Conta corrente criada com sucesso!");
                    break;

                case 2:
                    System.out.print("Titular: ");
                    String titularPoupanca = scanner.nextLine();

                    sistema.adicionarConta(titularPoupanca, "poupanca");
                    System.out.println("Conta poupança criada com sucesso!");
                    break;

                case 3:
                    sistema.listarContas();
                    break;

                case 4:
                    System.out.print("Digite o índice da conta: ");
                    int indice = scanner.nextInt();

                    if (sistema.selecionarConta(indice)) {
                        System.out.println("Conta selecionada com sucesso!");
                    } else {
                        System.out.println("Conta inválida!");
                    }
                    break;

                case 5:
                    System.out.print("Valor do depósito: ");
                    double deposito = scanner.nextDouble();

                    if (sistema.executarDeposito(deposito)) {
                        System.out.println("Depósito realizado!");
                    } else {
                        System.out.println("Erro: selecione uma conta primeiro!");
                    }
                    break;

                case 6:
                    System.out.print("Valor do saque: ");
                    double saque = scanner.nextDouble();

                    if (sistema.executarSaque(saque)) {
                        System.out.println("Saque realizado!");
                    } else {
                        System.out.println("Erro: saldo insuficiente ou conta não selecionada!");
                    }
                    break;

                case 7:
                    System.out.println("Saldo atual: R$ " + sistema.mostrarSaldo());
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}