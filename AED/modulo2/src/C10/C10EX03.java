package C10;

import java.util.Scanner;

public class C10EX03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double serie = 0, raio, valora, pi = 3.1416;
        System.out.print("Digite o valor de a");
        valora = teclado.nextDouble();

        do {
            System.out.print("digite o valor de R: ");
            raio = teclado.nextDouble();

            serie = (valora * pi * Math.pow(raio, 2)) / 360;

            System.out.println("S -> " + serie);
        } while (raio != -1);

        teclado.close();
    }
}
