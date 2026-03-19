package br.com.faesa.bankacc;

import static br.com.faesa.bankacc.ProgramaPrincipal.scanner;

public class ContaBancaria {
    private int numero_conta;
    private String titular;
    private double saldo;

    // Construtor criado de acordo com a solicitação do documento
    public ContaBancaria() {
    }

    // Construtor que recebe os parâmetros
    public ContaBancaria(int numero_conta, String titular) {
        this.saldo = 0;
        this.numero_conta = numero_conta;
        this.titular = titular;
    }

    // SETTERS
    public void setTitular(String titular) {
        this.titular = titular;
    }

    // GETTERS
    public String getTitular() {
        return titular;
    }

    public int getNumero_conta() {
        return numero_conta;
    }

    public double getSaldo() {
        return saldo;
    }

    // Metódo para adicioanr valor ao saldo atual da conta bancária
    private void depositar(double valor) {
        System.out.println("Digite o valor que você deseja depositar: ");
        valor = scanner.nextInt();

        this.saldo += valor;
        System.out.println("Saldo atual: " + this.saldo);
    }

    // Metódo que confere se existe saldo o suficiente para retirar da conta ou não, caso tenha é retirado
    private boolean sacar(double valor) {
        System.out.println("Digite o valor que você deseja sacar: ");

        if (saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque efetuado com sucesso!\nSaldo atual: " + this.saldo);
            return true;
        } else {
            System.out.println("Saldo insuficiente");
            return false;
        }
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numero_conta=" + numero_conta +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
