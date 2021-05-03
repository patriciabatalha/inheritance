package com.company;

public class Main {

    public static void main(String[] args) {
        Conta c1 = new Conta(123, "Pessoa1", 500);
        Conta c2 = new Conta(123, "Pessoa2", 300);
        Conta c3 = new Conta(123, "Pessoa3", 100);

        Pessoa p1 = new Pessoa("Pessoa1", "123123123", "Rua 1", c1);
        Pessoa p2 = new Pessoa("Pessoa2", "123123123", "Rua 2", c2);
        Pessoa p3 = new Pessoa("Pessoa3", "123123123", "Rua 3", c3);

        boolean saque1 = p1.getConta().saque(200);
        if (saque1) {
            System.out.println("Você tem limite na conta!");
        } else {
            System.out.println("Você não tem limite na conta!");
        }

        boolean saque2 = p2.getConta().saque(100);
        if (saque2) {
            p3.getConta().transferir(100);
            System.out.println("Transferência feita com sucesso!");
        } else {
            System.out.println("Você não tem limite na conta. Transação não efetuada!");
        }

        boolean saque3 = p3.getConta().saque(50);
        if (saque3) {
            System.out.println("Você tem limite na conta!");
        } else {
            System.out.println("Você não tem limite na conta!");
        }

        System.out.printf("O cliente %s tem o saldo de $%.2f \n", p1.getNome(), c1.getSaldo());
        System.out.printf("O cliente %s tem o saldo de $%.2f \n", p2.getNome(), c2.getSaldo());
        System.out.printf("O cliente %s tem o saldo de $%.2f \n", p3.getNome(), c3.getSaldo());
        System.out.println("-------------------------------------------");

        //Exercício 09 - Lista 2

        ContaCorrente cc1 = new ContaCorrente(123, "Pessoa4", 100);
        ContaPoupanca cp1 = new ContaPoupanca(123, "Pessoa5", 500);

        Pessoa p4 = new Pessoa("Pessoa4", "123123123", "Rua 4", cc1);
        Pessoa p5 = new Pessoa("Pessoa5", "123123123", "Rua 5", cp1);

        boolean saque4 = p4.getConta().saque(100);
        if (saque4) {
            System.out.println("Você tem limite na conta!");
        } else {
            System.out.println("Você não tem limite na conta!");
        }

        boolean saque5 = p4.getConta().saque(200);
        if (saque5) {
            System.out.println("Você tem limite na conta!");
        } else {
            System.out.println("Você não tem limite na conta!");
        }

        p5.getConta().saque(200);

        System.out.printf("O cliente %s tem o saldo de $%.2f \n", p4.getNome(), cc1.getSaldo());
        System.out.printf("O cliente %s tem o saldo de $%.2f \n", p5.getNome(), cp1.getSaldo());

    }
}

