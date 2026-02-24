package models;

public class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo){

        this.saldo = saldo;
        this.titular = titular;

    }
    public ContaBancaria(){}

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
