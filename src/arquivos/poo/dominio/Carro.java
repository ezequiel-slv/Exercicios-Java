package arquivos.poo.dominio;

public class Carro {
    public String modelo;
    public int ano;
    public int velocidade;

    public void MostrarDados(){
        System.out.println("--------");
        System.out.println(this.modelo);
        System.out.println(this.ano);
        System.out.println(this.velocidade);
    }

    public void AumentaVelocidade(Carro altavel){
        System.out.println("-------");
        int velocidade = altavel.velocidade;
        if (velocidade <= 20) {
            System.out.println(velocidade + 70);
        }
    }

    public void DiminuiVelocidade(Carro baixavel){
        System.out.println("-------");
        int velocidade = baixavel.velocidade;
        if (velocidade >= 120){
            System.out.println(velocidade - 30);
        }

    }

    public void NovoOuVelho(Carro conservacao){
        System.out.println("-------");
        int ano = conservacao.ano;
        if (ano >= 2020){
            System.out.println("Carro novo");
        }else{
            System.out.println("Carro antigo");
        }

    }
}
