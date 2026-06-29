package br.com.revisao.classes;

public class Temperatura {
    String local;
    double temperaturaAtual;

    public Temperatura(String localInicial, double temperaturaInicial){
        local = localInicial;
        temperaturaAtual = temperaturaInicial;
    }

    public void exibirInfo() {
        System.out.println("Sensor no local: " + local);
        System.out.printf("Temperatura: %.1f ºC\n", temperaturaAtual);

        if (temperaturaAtual > 37.5) {
            System.out.println("Alerta: Temperatura acima do limite!");
        }
    }
}
