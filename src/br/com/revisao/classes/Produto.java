package br.com.revisao.classes;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public Produto(String nomeInicial, double precoInicial, int quantidadeInicial){
        nome = nomeInicial;
        preco = precoInicial;
        quantidade = quantidadeInicial;
    }

    public void exibirInfo(){
        System.out.printf("Produto %s - Preço %.2f - Quantidade %d", nome, preco, quantidade);
    }
}
