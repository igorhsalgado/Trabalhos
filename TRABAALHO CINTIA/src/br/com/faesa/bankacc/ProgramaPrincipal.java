package br.com.faesa.bankacc;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaPrincipal {
    public  static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<ContaBancaria> contas = new ArrayList<>();
        int opcao = 0;

        do  {
            System.out.println("""
                    ------ MENU DO BANCO ------
                    
                    1- Cadastrar
                    2- Mostrar o Saldo
                    3- Depositar
                    4- Sacar
                    5- Sair
                    Digite a opcao: 
                    """);

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarConta(contas);
                    break;
                case 2:
                    System.out.println("Saldo atual da conta: ");
                    break;
                case 3:
                    System.out.println("Você escolheu a terceira opção.");
                    break;
                case 4:
                    System.out.println("Você escolheu a quarta opção.");
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    break;
            }
        } while (opcao != 5);

        scanner.close();
    }

    public static void cadastrarConta(ArrayList<ContaBancaria> contas) {
        scanner.nextLine();

        System.out.println("""
                    ------ MENU DE CADASTRO  ------
                    
                    Digite o titular da conta:
                    """);
        String titular = scanner.nextLine();

        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();

        scanner.nextLine();

        contas.add(new ContaBancaria(numero, titular));
    }
}
