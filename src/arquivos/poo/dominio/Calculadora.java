package arquivos.poo.dominio;

public class Calculadora {
    public int num1;
    public int num2;
    public int num3;

    public void calcular(){
        System.out.println("---calculo---");
        System.out.println(num1 + num2 * num3);
    }

    public void MaiorOuIgual(){
        System.out.println("---Maior ou menor---");
        if (num1 >= num2){
            System.out.println("Primeiro numero maior que o segundo");
        }else{
            System.out.println("Segundo numero maior que o segundo");
        }

    }

    public void Media(Calculadora calculadora){
        int media = (calculadora.num1 + calculadora.num2 + calculadora.num3)/3;
        System.out.println("---Média---");
        System.out.println(media);
    }
}
