package arquivos.poo.teste;

import arquivos.poo.dominio.Carro;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro altavel = new Carro();
        Carro baixavel = new Carro();
        Carro conservacao = new Carro();

        carro.ano = 2023;
        carro.modelo = "volkswagen polo 2023";
        carro.velocidade = 100;
        carro.MostrarDados();

        altavel.ano = 2023;
        altavel.modelo = "volkswagen polo 2023";
        altavel.velocidade = 20;
        altavel.AumentaVelocidade(altavel);

        baixavel.ano = 2023;
        baixavel.modelo = "volkswagen polo 2023";
        baixavel.velocidade = 120;
        baixavel.DiminuiVelocidade(baixavel);

        conservacao.ano = 2023;
        conservacao.modelo = "volkswagen polo 2023";
        conservacao.velocidade = 100;
        conservacao.NovoOuVelho(conservacao);




    }
}
