package br.com.revisao.heranca_e_polimorfismo.revisao5;

public class Main {
    static void main(String[] args) {
        System.out.println("Sistema de pagamentos");
        Pagamento cartao = new CartaoCredito(250.00);
        Pagamento boleto = new BoletoBancario(500.00);
        Pagamento pix = new Pix(300.00);

        cartao.confirmarPagamento();
        boleto.confirmarPagamento();
        pix.confirmarPagamento();
    }
}
