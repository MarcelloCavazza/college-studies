package C05;

import java.util.Scanner;

public class C05EX02 {
    // Autor: Marcello Henrique Cavazza Oliveira
    public static void main(String[] args) {
        double raio, area, volume;
        final double pi = 3.1416;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o valor do raio: ");
        raio = teclado.nextDouble();
        volume = (4.0/3.0) * pi * Math.pow(raio, 3);
        area = 4 * pi * Math.pow(raio, 2);
        System.out.println("Raio: "+ raio +
                "\nArea: "+area+
                "\nVolume: "+volume);
        teclado.close();
    }
}
