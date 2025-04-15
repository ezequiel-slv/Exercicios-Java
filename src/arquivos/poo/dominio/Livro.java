package arquivos.poo.dominio;

public class Livro {
    public String titulo;
    public String autor;
    public int numeroPaginas;

    public void MostrarDados(){
        System.out.println("--------");
        System.out.println(this.titulo);
        System.out.println(this.autor);
        System.out.println(this.numeroPaginas);
    }

    public void TamanhoLivro(Livro paginas){
        System.out.println("--------");
        int numeropag = paginas.numeroPaginas;
        if (numeropag >= 300){
            System.out.println("Livro grande");
        }

    }

    public void TituloAutor(Livro autor){
        System.out.println("-------");
        String autortitulo = autor.autor;
        System.out.println(autortitulo);

    }
}
