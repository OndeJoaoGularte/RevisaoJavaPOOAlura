package br.com.revisao.heranca_e_polimorfismo.revisao7;

public class Main {
    static void main(String[] args) {
        System.out.println("Controle de reservas");
        Reserva r = new Reserva();
        r.reservar();
        r.reservar("10/04");
        r.reservar("12/04", 4);

        Reserva vip = new ReservaVip();
        vip.reservar();
    }
}
