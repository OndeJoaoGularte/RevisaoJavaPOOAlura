package br.com.revisao.classes;

public class Conta {
    double saldo;

    public Conta(double saldoInicial){
        saldo = saldoInicial;
    }

    public void exibirSaldo(){
        System.out.println("Seu saldo é " + saldo);
    }

    public void zerarSaldo() {
        saldo = 0;
    }
}
