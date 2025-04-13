package arquivos.poo.teste;

import arquivos.poo.dominio.Funcionario;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        Funcionario comparador = new Funcionario();

        funcionario1.nome = "Laura";
        funcionario1.salario = 3200;
        funcionario1.MostrarDados();

        funcionario2.nome = "João";
        funcionario2.salario = 4000;
        funcionario2.MostrarDados();

        comparador.CompararSalario(funcionario1, funcionario2);

    }
}
