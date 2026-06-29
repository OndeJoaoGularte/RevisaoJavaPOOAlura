package br.com.revisao.classes;

public class Aluno {
    String nome;
    double nota1;
    double nota2;

    public Aluno(String nomeInicial, double nota1Inicial, double nota2Inicial){
        nome = nomeInicial;
        nota1 = nota1Inicial;
        nota2 = nota2Inicial;
    }

    void exibirResultado() {
        double media = (nota1 + nota2) / 2;

        System.out.println("Aluno: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.printf("Média: %.1f\n", media);

        if (media >= 7) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
    }
}
