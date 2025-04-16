package arquivos.poo.teste;

import arquivos.poo.dominio.Calculadora;

import java.util.Scanner;

public class TesteCalculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("Digite primeiro numero: ");
        calculadora.num1 = entrada.nextInt();

        System.out.println("Digite segundo numero: ");
        calculadora.num2 = entrada.nextInt();

        System.out.println("Digite terceiro numero: ");
        calculadora.num3 = entrada.nextInt();

        calculadora.calcular();
        calculadora.MaiorOuIgual();
        calculadora.Media(calculadora);
        entrada.close();



    }
}
