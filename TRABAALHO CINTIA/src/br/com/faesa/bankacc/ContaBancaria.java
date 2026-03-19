package br.com.faesa.bankacc;

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

    // Metódo para adicionar valor ao saldo atual da conta bancária
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito efetuado com sucesso\nSaldo atual: " + this.saldo);
        } else  {
            System.out.println("Valor do depósito inválido!");
        }
    }

    // Metódo que confere se existe saldo o suficiente para retirar da conta ou não, caso tenha é retirado
    public boolean sacar(double valor) {
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
