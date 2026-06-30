package br.com.revisao.heranca_e_polimorfismo.revisao8;

public class Main {
    static void main(String[] args) {
        System.out.println("Implementando uma interface");
        Relatorio rel = new Relatorio(
                "Relatório 2025",
                "Tudo funcionando conforme esperado."
        );
        rel.imprimir();
    }
}
