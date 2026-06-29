package br.com.revisao.classes;

public class Tarefa {
    String descricao;
    boolean concluida;

    public Tarefa(String descricaoInicial, boolean status){
        descricao = descricaoInicial;
        concluida = status;
    }

    void exibirTarefa() {
        if (concluida) {
            System.out.println("Tarefa: " + descricao + " - Status: Concluída");
        } else {
            System.out.println("Tarefa: " + descricao + " - Status: Pendente");
        }
    }
}
