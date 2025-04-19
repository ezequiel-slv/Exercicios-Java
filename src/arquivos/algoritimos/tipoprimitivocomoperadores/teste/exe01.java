package arquivos.algoritimos.tipoprimitivocomoperadores.teste;

import java.util.Scanner;

public class exe01 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        Double nota1 = entrada.nextDouble();

        System.out.println("Digite a segunda nota: ");
        Double nota2 = entrada.nextDouble();

        System.out.println("Digite a terceira nota: ");
        Double nota3 = entrada.nextDouble();

        double media = ((nota1 + nota2 + nota3)/3);

        System.out.printf("Média: %.2f\n", media);
        System.out.println("---------");

        if (media >= 7){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }




        }
    }

