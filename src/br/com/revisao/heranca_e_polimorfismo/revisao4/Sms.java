package br.com.revisao.heranca_e_polimorfismo.revisao4;

class Sms extends Notificacao {
    public Sms(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }

    @Override
    public void enviar() {
        System.out.printf("\nEnviando SMS para: %s\nMensagem: %s", destinatario, mensagem);
    }
}
