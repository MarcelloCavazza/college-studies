package C05;

import java.util.Scanner;

public class C05EX06 {
    // Autor: Marcello Henrique Cavazza Oliveira
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira no valor de A: ");
        double a = teclado.nextDouble();
        System.out.print("Insira no valor de B: ");
        double b = teclado.nextDouble();
        System.out.print("Insira no valor de C: ");
        double c = teclado.nextDouble();
        System.out.print("Insira no valor de X: ");
        double x = teclado.nextDouble();
        System.out.print("Insira no valor de Y: ");
        double y = teclado.nextDouble();

        double distancia = a*x + b*y + c;

        System.out.println("A distancia entre o ponto P e a reta R é "+ distancia);

        teclado.close();
    }
}
