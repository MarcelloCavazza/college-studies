package C05;

import java.util.Scanner;

public class C05EX09 {
    // Autor: Marcello Henrique Cavazza Oliveira
    public static void main(String[] args) {
        int peso1 = 2, peso2 = 3, peso3 = 5;
        double nota1, nota2, nota3, resultado;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira sua primeira nota: ");
        nota1 = teclado.nextDouble();
        System.out.print("Insira sua segunda nota: ");
        nota2 = teclado.nextDouble();
        System.out.print("Insira sua terceira nota: ");
        nota3 = teclado.nextDouble();

        resultado = (nota1*peso1 + nota2*peso2 + nota3*peso3)/(peso1+peso2+peso3);

        System.out.println("A media pondera eh: "+resultado);

        teclado.close();
    }
}
