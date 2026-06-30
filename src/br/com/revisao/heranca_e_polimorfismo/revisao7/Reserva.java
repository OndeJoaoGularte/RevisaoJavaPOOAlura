package br.com.revisao.heranca_e_polimorfismo.revisao7;

public class Reserva {
    public void reservar() {
        System.out.println("Reserva realizada");
    }

    public void reservar(String data) {
        System.out.println("Reserva feita para o dia " + data);
    }

    public void reservar(String data, int pessoas) {
        System.out.println("Reserva feita para o dia " + data + " para " + pessoas + " pessoas");
    }
}
