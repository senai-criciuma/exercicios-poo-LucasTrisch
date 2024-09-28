package Exer33;

public abstract class ContaBancaria {
    private int nmerconta;
    private String titular;
    private double saldo;

    public int getNmerconta() {
        return nmerconta;
    }

    public void setNmerconta(int nmerconta) {
        this.nmerconta = nmerconta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(){
    }
    public void sacar(){
    }
    public void consultarSaldo(){
    }
}
