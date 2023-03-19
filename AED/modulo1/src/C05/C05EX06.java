package C05;

import java.util.Scanner;

public class C05EX06 {
    // Autor: Marcello Henrique Cavazza Oliveira
    public static void main(String[] args) {
        double a, b, c, x, y, distancia;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira no valor de A: ");
        a = teclado.nextDouble();
        System.out.print("Insira no valor de B: ");
        b = teclado.nextDouble();
        System.out.print("Insira no valor de C: ");
        c = teclado.nextDouble();
        System.out.print("Insira no valor de X: ");
        x = teclado.nextDouble();
        System.out.print("Insira no valor de Y: ");
        y = teclado.nextDouble();

        distancia = a*x + b*y + c;

        System.out.println("A distancia entre o ponto P e a reta R é "+ distancia);

        teclado.close();
    }
}
