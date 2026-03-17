package br.com.faesa.bankacc;

public class ContaBancaria {
    private int numero_conta;
    private String titular;
    private double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(double saldo, int numero_conta, String titular) {
        this.saldo = saldo;
        this.numero_conta = numero_conta;
        this.titular = titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

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
        this.saldo += valor;
    }

    // Metódo que confere se existe saldo o suficiente para retirar da conta ou não, caso tenha é retirado
    private boolean sacar(double valor) {
        if (saldo >= valor) {
            this.saldo -= valor;
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
