package C05;

import java.util.Scanner;

public class C05EX09 {
    // Autor: Marcello Henrique Cavazza Oliveira
    public static void main(String[] args) {
        final int peso1 = 2, peso2 = 3, peso3 = 5;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira sua primeira nota: ");
        double nota1 = teclado.nextDouble();
        System.out.print("Insira sua segunda nota: ");
        double nota2 = teclado.nextDouble();
        System.out.print("Insira sua terceira nota: ");
        double nota3 = teclado.nextDouble();

        double resultado = (nota1*peso1 + nota2*peso2 + nota3*peso3)/(peso1+peso2+peso3);

        System.out.println("A media pondera eh: "+resultado);

        teclado.close();
    }
}
