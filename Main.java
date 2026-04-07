package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria("93102-1", "Matheus Baia");
        SistemaBanco sistema = new SistemaBanco(conta);

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Exibir saldo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Digite o valor do depósito: R$ ");
                    double deposito = scanner.nextDouble();

                    if (sistema.executarDeposito(deposito)) {
                        System.out.println("Depósito realizado com sucesso!");
                        System.out.println("Saldo atual: R$ " + sistema.mostrarSaldo());
                    } else {
                        System.out.println("Valor inválido!");
                    }
                    break;

                case 2:
                    System.out.print("Digite o valor do saque: R$ ");
                    double saque = scanner.nextDouble();

                    if (sistema.executarSaque(saque)) {
                        System.out.println("Saque realizado com sucesso!");
                        System.out.println("Saldo atual: R$ " + sistema.mostrarSaldo() );
                    } else {
                        System.out.println("Saque inválido ou saldo insuficiente!");
                    }
                    break;

                case 3:
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