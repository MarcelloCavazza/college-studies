package C05;

import java.util.Scanner;

public class C05EX04 {
    public static void main(String[] args) {
        double x1,y1, x2, y2, distancia;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o valor de X no ponto 1: ");
        x1 = teclado.nextDouble();
        System.out.print("Insira o valor de y no ponto 1: ");
        y1 = teclado.nextDouble();
        System.out.print("Insira o valor de X no ponto 2: ");
        x2 = teclado.nextDouble();
        System.out.print("Insira o valor de y no ponto 2: ");
        y2 = teclado.nextDouble();

        distancia = Math.sqrt((Math.pow((x1-x2),2))+(Math.pow((y1-y2),2)));

        System.out.println("A distancia entre o ponto 1("+x1+","+y1+") e o ponto 2 ("+x2+","+y2+") eh igual a "+distancia);

        teclado.close();
    }
}
