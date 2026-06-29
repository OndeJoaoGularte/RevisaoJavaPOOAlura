package br.com.revisao.encapsulamento;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Cadastrando veículos
        System.out.println("Cadastrando veículos");
        Carro gol = new Carro("Gol", "ABC-1234", 2020);

        System.out.println("Veículo cadastrado:");
        System.out.println("Modelo: " + gol.getModelo());
        System.out.println("Placa: " + gol.getPlaca());
        System.out.println("Ano: " + gol.getAno());

        // Agenda de contatos
        System.out.println("\nAgenda de contatos");
        ArrayList<Contato> contatos = new ArrayList<>();

        contatos.add(new Contato("João Silva", "(11) 99999-0000"));
        contatos.add(new Contato("Luana Santos", "(21) 98888-0000"));
        contatos.add(new Contato("Pedro Oliveira", "(31) 97777-0000"));

        System.out.println("Lista de contatos:");
        int indice = 1;
        for (Contato contato : contatos) {
            System.out.printf("%d. %s - %s\n",
                    indice++,
                    contato.getNome(),
                    contato.getTelefone());
        }

        // Cadastro de produtos com validação
        System.out.println("\nCadastro de produtos com validação");
        Produto p1 = new Produto();
        p1.setNome("Mouse");
        p1.setPreco(-59.90);

        System.out.printf("Produto: %s\nPreço: %.2f\n", p1.getNome(), p1.getPreco());

        // Controle de senha
        System.out.println("\nControle de senha");
        Usuario user = new Usuario("123456");
        user.setSenha("1234s56", "abc123");

        // Controle do nível de bateria
        System.out.println("\nControle do nível de bateria");
        Bateria b = new Bateria();
        b.setNivel(85);
        System.out.println("Status: " + b.exibirStatus());

        // Controle de saldo bancário
        System.out.println("\nControle de saldo bancário");
        Conta conta = new Conta("Ana");
        conta.depositar(1000.00);
        conta.sacar(1200.00);
        conta.exibirSaldo();

        // Avaliação de filmes
        System.out.println("\nAvaliação de filmes");
        Filme matrix = new Filme("Matrix");
        matrix.adicionarAvaliacao(5);
        matrix.adicionarAvaliacao(4);
        matrix.adicionarAvaliacao(5);
        matrix.adicionarAvaliacao(3);
        matrix.adicionarAvaliacao(4);

        System.out.printf("Média de avaliações para %s: %.2f\n",
                matrix.getTitulo(), matrix.calcularMedia());

        // Validação de login
        System.out.println("\nValidação de login");
        Login login = new Login("aluno2025", "escola@123");
        int tentativasRestantes = 3;

        while (tentativasRestantes > 0) {
            System.out.print("Digite o seu usuário: ");
            String usuario = sc.nextLine();

            System.out.print("Digite a sua senha: ");
            String senha = sc.nextLine();

            if (login.validarSenha(usuario, senha)) {
                System.out.println("Login bem-sucedido!");
                break;
            } else {
                tentativasRestantes--;
                if (tentativasRestantes == 0) {
                    System.out.println("Acesso bloqueado. Contate o administrador.");
                } else {
                    System.out.println("Senha incorreta. Tentativas restantes: " + tentativasRestantes);
                }
            }
        }

        // Sistema de pontos para alunos
        System.out.println("\nSistema de pontos para alunos");
        Aluno aluno = new Aluno("Fernanda");

        aluno.ganharPontos(120);
        aluno.exibirStatus();

        // Registro de notas
        System.out.println("\nRegistro de notas");
        Disciplina matematica = new Disciplina("Matemática");
        matematica.adicionarNota(7.5);
        matematica.adicionarNota(11.0);
        matematica.adicionarNota(8.0);
        matematica.adicionarNota(-3.0);
        matematica.adicionarNota(9.5);

        System.out.println("Total de notas válidas: " + matematica.contarNotasValidas());
        System.out.printf("Média em %s: %.2f\n", matematica.getNome(), matematica.calcularMedia());

        sc.close();
    }
}
