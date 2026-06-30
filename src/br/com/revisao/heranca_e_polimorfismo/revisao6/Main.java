package br.com.revisao.heranca_e_polimorfismo.revisao6;

public class Main {
    static void main(String[] args) {
        System.out.println("Enviando mensagens");
        Notificador notificacao = new Notificador();

        notificacao.enviarMensagem("Olá!");
        notificacao.enviarMensagem("João", "Bom dia!");
        notificacao.enviarMensagem("Maria", "Atenção!", 2);
    }
}
