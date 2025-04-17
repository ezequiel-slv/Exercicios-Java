package arquivos.poo.teste;

import arquivos.poo.dominio.Pessoa;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Ezequiel");
        pessoa.setIdade(22);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}
