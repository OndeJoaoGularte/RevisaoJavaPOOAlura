package br.com.revisao.classes;

public class Livro {
    String titulo;
    String autor;
    int paginas;

    public Livro(String tituloInicial, String autorInicial, int paginasInicial){
        titulo = tituloInicial;
        autor = autorInicial;
        paginas = paginasInicial;
    }

    public void exibirInfo(){
        System.out.printf("\"%s\" de %s com %d páginas%n", titulo, autor, paginas);
    }
}
