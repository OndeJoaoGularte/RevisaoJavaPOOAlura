package br.com.revisao.classes;

public class ItemCarrinho {
    String nome;
    double preco;
    int quantidade;

    public ItemCarrinho(String nomeInicial, double precoInicial, int quantidadeInicial){
        nome = nomeInicial;
        preco = precoInicial;
        quantidade = quantidadeInicial;
    }

    double exibirTotal() {
        return preco * quantidade;
    }
}
