package br.com.revisao.classes;

public class ItemEstoque {
    String nome;
    int quantidade;

    public ItemEstoque(String nomeInicial, int quantidadeInicial){
        nome = nomeInicial;
        quantidade = quantidadeInicial;
    }

    void vender(int qtdVendida) {
        if (qtdVendida <= quantidade) {
            quantidade -= qtdVendida;
            System.out.printf("Venda realizada. Estoque restante de %s: %d%n", nome, quantidade);
        } else {
            System.out.println("Estoque insuficiente");
        }
    }
}
