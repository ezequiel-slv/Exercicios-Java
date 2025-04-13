package arquivos.poo.dominio;

public class Funcionario {
    public String nome;
    public int salario;

    public void MostrarDados() {
        System.out.println("------");
        System.out.println("funcionario 1: " + this.nome);
        System.out.println("funcionario 1: " + this.salario);
    }


    public void CompararSalario(Funcionario funcionario1, Funcionario funcionario2) {
        if (funcionario1.salario > funcionario2.salario) {
            System.out.println(funcionario1.nome);
            System.out.println(funcionario1.salario);

        } else if (funcionario2.salario > funcionario1.salario) {
            System.out.println(funcionario2.nome);
            System.out.println(funcionario2.salario);
        } else {
            System.out.println("Os salãrios são iguais");
        }
    }

}
