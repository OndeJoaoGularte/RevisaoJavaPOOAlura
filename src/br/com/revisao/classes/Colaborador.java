package br.com.revisao.classes;

public class Colaborador {
    String nome;
    String cargo;
    int nivelAcesso;

    public Colaborador(String nomeInicial, String cargoInicial, int acessoInicial){
        nome = nomeInicial;
        cargo = cargoInicial;
        nivelAcesso = acessoInicial;
    }

    void atualizarDados(String novoCargo, int novoNivel) {
        System.out.println("--- Antes da atualização ---");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Nível de acesso: " + nivelAcesso + "\n");

        cargo = novoCargo;
        nivelAcesso = novoNivel;

        System.out.println("--- Após atualização ---");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Nível de acesso: " + nivelAcesso);
    }
}
