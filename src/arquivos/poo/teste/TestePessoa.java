package arquivos.poo.teste;

import arquivos.poo.dominio.Pessoa;

import java.util.Scanner;

public class TestePessoa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.println("Digite seu nome: ");
        String nome = entrada.next();
        pessoa.setNome(nome);

        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();
        pessoa.setIdade(idade);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}
