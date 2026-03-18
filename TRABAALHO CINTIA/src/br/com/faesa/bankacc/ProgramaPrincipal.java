package br.com.faesa.bankacc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaPrincipal {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<ContaBancaria> contas = new ArrayList<>();
        int opcao = 0;

        do  {
            System.out.println("""
                    ------ MENU O BANCO ------
                    
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
                    System.out.println("Você escolheu a primeira opção.");
                    break;
                case 2:
                    System.out.println("Você escolheu a segunda opção.");
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
}
