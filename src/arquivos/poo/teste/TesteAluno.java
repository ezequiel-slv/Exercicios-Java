package arquivos.poo.teste;

import arquivos.poo.dominio.Aluno;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Aluno nota1 = new Aluno();
        Aluno nota2 = new Aluno();
        Aluno media = new Aluno();

        aluno.nome = "Janaina";
        aluno.MostrarDados();

        nota1.nota = 8;
        nota1.nome = "Nota 1";
        nota1.MostrarDados();

        nota2.nota = 4;
        nota2.nome = "Nota 2";
        nota2.MostrarDados();

        media.MediaNotas(nota1, nota2);
        media.MostrarMedia(nota1, nota2);
    }
}
