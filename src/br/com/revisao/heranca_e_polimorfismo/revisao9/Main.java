package br.com.revisao.heranca_e_polimorfismo.revisao9;

public class Main {
    static void main(String[] args) {
        System.out.println("Sistema bancário");
        OperacaoBancaria deposito = new Deposito(200.0);
        OperacaoBancaria saque = new Saque(50.5);

        deposito.executar();
        saque.executar();
    }
}
