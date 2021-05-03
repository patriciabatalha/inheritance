package com.company;

public class ContaCorrente extends Conta {
    public final int LIMITE = 100;

    public ContaCorrente(int numero, String dono, double saldo) {
        super(numero, dono, saldo);
    }

    @Override
    public boolean saque(double valor) {
        if (valor <= getSaldo() + LIMITE) {
            setSaldo(getSaldo() - valor);
            return true;
        }
        return false;
    }
}
