package com.company;

public class Conta {

    private int numero;
    private String dono;
    private double saldo;

    public Conta(){
    }

    public Conta(int numero, String dono, double saldo) {
        this.numero = numero;
        this.dono = dono;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean saque(double valor){
        if (valor <= saldo){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public void transferir(double valor){
        this.saldo += valor;
    }

    public String verInfo(){
        return "Cliente "
                + dono + ", seu saldo consolidado é $"
                + saldo;
    }
}
