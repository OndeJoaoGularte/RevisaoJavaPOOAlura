package br.com.revisao.classes;

public class PedidoLivro {
    String titulo;
    int diasAtraso;

    public PedidoLivro(String tituloInicial, int atrasoInicial){
        titulo = tituloInicial;
        diasAtraso = atrasoInicial;
    }

    double calcularMulta() {
        return diasAtraso * 2.50;
    }

    void exibirInfo() {
        double multa = calcularMulta();
        System.out.printf("Livro: %s | Multa por %d dias de atraso: R$ %.2f%n",
                titulo, diasAtraso, multa);
    }
}
