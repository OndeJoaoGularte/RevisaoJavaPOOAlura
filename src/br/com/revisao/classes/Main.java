package br.com.revisao.classes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {

        // Relatório do produto
        System.out.println("Relatório do produto");
        Produto produto = new Produto("Mouse", 159.9, 25);
        produto.exibirInfo();

        // Imprimindo o resumo do livro
        System.out.println("\nImprimindo o resumo do livro");
        Livro livro = new Livro("O Guia do Mochileiro das Galáxias", "Douglas Adams", 208);
        livro.exibirInfo();

        // Zerando o saldo
        System.out.println("\nZerando o saldo");
        Conta conta = new Conta(1579.42);
        conta.exibirSaldo();
        conta.zerarSaldo();
        conta.exibirSaldo();

        // Controle de temperatura
        System.out.println("\nControle de temperatura");
        Temperatura temperatura = new Temperatura("Setor A", 39.2);
        temperatura.exibirInfo();

        // Calculando as notas
        System.out.println("\nCalculando as notas");
        Aluno aluno = new Aluno("João Silva", 6.5, 7.5);
        aluno.exibirResultado();

        // Corrigindo o cadastro
        System.out.println("\nCorrigindo o cadastro");
        Colaborador colaborador = new Colaborador("Júlia Oliveira", "Desenvolvedor Júnior", 1);
        colaborador.atualizarDados("Desenvolvedor Pleno", 2);

        // Controle de tarefas
        System.out.println("\nControle de tarefas");
        Tarefa t1 = new Tarefa("Estudar Java", false);

        Tarefa t2 = new Tarefa("Fazer exercícios", true);

        List<Tarefa> lista = new ArrayList<>();
        lista.add(t1);
        lista.add(t2);

        for (Tarefa t : lista) {
            t.exibirTarefa();
        }

        // Controle de estoque
        System.out.println("\nControle de estoque");
        ItemEstoque item = new ItemEstoque("Camiseta", 10);

        item.vender(3);
        item.vender(8);

        // Multa por atraso
        System.out.println("\nMulta por atraso");
        PedidoLivro pedido = new PedidoLivro("Dom Casmurro", 3);

        pedido.exibirInfo();

        // Carrinho de compras
        System.out.println("\nCarrinho de compras");
        ItemCarrinho i1 = new ItemCarrinho("Teclado", 120, 1);
        ItemCarrinho i2 = new ItemCarrinho("Mouse", 60, 2);

        List<ItemCarrinho> carrinho = new ArrayList<>();
        carrinho.add(i1);
        carrinho.add(i2);

        double totalCompra = 0;
        for (ItemCarrinho objeto : carrinho) {
            totalCompra += objeto.exibirTotal();
        }

        System.out.printf("Total da compra: R$ %.2f\n", totalCompra);
    }
}
