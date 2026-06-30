package br.com.revisao.heranca_e_polimorfismo.revisao1;

public class Main {
    static void main(String[] args) {
        System.out.println("Identificando o estudante");
        Aluno aluno1 = new Aluno("Fernanda", "regular");
        Bolsista aluno2 = new Bolsista("Lucas");

        aluno1.identificar();
        aluno2.identificar();
    }
}
