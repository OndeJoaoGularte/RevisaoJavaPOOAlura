package br.com.revisao.heranca_e_polimorfismo.revisao10;

public class Main {
    static void main(String[] args) {
        System.out.println("Controle de dispositivos");
        Luz luz = new Luz();
        ArCondicionado ar = new ArCondicionado();

        luz.ligar();
        luz.ligar();
        luz.desligar();

        ar.desligar();
    }
}
