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
                    ContaBancaria contaSaldo = localizarConta(contas);
                    if(contaSaldo != null) {
                        System.out.println("Saldo atual: " + contaSaldo.getSaldo());
                    }
                    break;
                case 3:
                    ContaBancaria contaDeposito = localizarConta(contas);
                    if(contaDeposito != null) {
                        System.out.println("Digite o valor que você deseja depositar: ");
                        double valorDeposito = scanner.nextDouble();

                        contaDeposito.depositar(valorDeposito);
                    }
                    break;
                case 4:
                    ContaBancaria contaSacar = localizarConta(contas);
                    if(contaSacar != null) {
                        System.out.println("Saldo atual: " + contaSacar.getSaldo() + "\nDigite o valor que deseja sacar: ");
                        double valorSacar = scanner.nextDouble();
                        
                        contaSacar.sacar(valorSacar);
                    }
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

        System.out.println("Conta criada com sucesso!");
        contas.add(new ContaBancaria(numero, titular));
    }

    public static ContaBancaria localizarConta(ArrayList<ContaBancaria> contas) {
        scanner.nextLine();

        System.out.println("""
                    ------ MENU DE BUSCA  ------
                    
                    Digite o número da conta:
                    """);
        int numero = scanner.nextInt();

        for (ContaBancaria conta : contas) {
            if (conta.getNumero_conta() == numero) {
                System.out.println("Conta localizada com sucesso!");
                return conta;
            }
        }
        System.out.println("Conta não encontrada!");
        return null;
    }
}
