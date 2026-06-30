package br.com.revisao.heranca_e_polimorfismo.revisao4;

public class Main {
    static void main(String[] args) {
        System.out.println("Sistema de notificação");
        Notificacao email = new Email(
                "cliente@exemplo.com",
                "Aproveite nossos descontos esta semana.",
                "Promoção especial!");

        Notificacao sms = new Sms(
                "(11) 98765-4321",
                "Sua fatura foi paga com sucesso.");

        Notificacao push = new Push(
                "usuario_app",
                "Você tem uma nova mensagem não lida.",
                "Novidade!");

        email.enviar();
        sms.enviar();
        push.enviar();

    }
}
