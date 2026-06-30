package br.com.revisao.heranca_e_polimorfismo.revisao7;

public class ReservaVip extends Reserva{
    @Override
    public void reservar() {
        System.out.println("Reserva VIP confirmada com atendimento exclusivo");
    }
}
