package C05;

import java.util.Scanner;

public class C05EX04 {
    // Autor: Marcello Henrique Cavazza Oliveira
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o valor de X no ponto 1: ");
        double x1 = teclado.nextDouble();
        System.out.print("Insira o valor de y no ponto 1: ");
        double y1 = teclado.nextDouble();
        System.out.print("Insira o valor de X no ponto 2: ");
        double x2 = teclado.nextDouble();
        System.out.print("Insira o valor de y no ponto 2: ");
        double y2 = teclado.nextDouble();

        double distancia = Math.sqrt((Math.pow((x1-x2),2))+(Math.pow((y1-y2),2)));

        System.out.println("A distancia entre o ponto 1("+x1+","+y1+") e o ponto 2 ("+x2+","+y2+") eh igual a "+distancia);

        teclado.close();
    }
}
