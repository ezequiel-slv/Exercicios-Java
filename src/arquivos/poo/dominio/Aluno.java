package arquivos.poo.dominio;

public class Aluno {
    public String nome;
    public int nota;

    public void MostrarDados() {
        System.out.println("---------");
        System.out.println(this.nome);
        System.out.println(this.nota);
    }

    public void MediaNotas(Aluno nota1, Aluno nota2) {
        int media = (nota1.nota + nota2.nota) / 2;
        System.out.println("---------");
        System.out.println(media);
    }

    public void MostrarMedia(Aluno nota1, Aluno nota2) {
        int media = (nota1.nota + nota2.nota) / 2;
        System.out.println("---------");
        if (media >= 6){
            System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado");
        }
    }

}
