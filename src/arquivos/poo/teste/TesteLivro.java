package arquivos.poo.teste;

import arquivos.poo.dominio.Livro;

public class TesteLivro {
    public static void main(String[] args) {
        Livro livro = new Livro();
        Livro paginas = new Livro();
        Livro autor = new Livro();

        livro.titulo = "Algoritimos";
        livro.autor = "Manzano";
        livro.numeroPaginas = 757;
        livro.MostrarDados();

        paginas.titulo = "Algoritimos";
        paginas.autor = "Manzano";
        paginas.numeroPaginas = 757;
        paginas.TamanhoLivro(paginas);

        autor.titulo = "Algoritimos";
        autor.autor = "Algoritimos por Manzano";
        autor.numeroPaginas = 757;
        autor.TituloAutor(autor);



    }
}
