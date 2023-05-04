package C10;

import java.util.Scanner;

public class C10EX06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a, b, c, x, y, r, d;

        System.out.println(
                "A leitura das coordenadas sera interrompida quando se achar um ponto P que coincida com reta R");
        System.out.print("Digite o A: ");
        a = teclado.nextDouble();
        System.out.print("Digite o B: ");
        b = teclado.nextDouble();
        System.out.print("Digite o C: ");
        c = teclado.nextDouble();
        do {
            System.out.print("Digite a coordenada X: ");
            x = teclado.nextDouble();
            System.out.print("Digite a coordenada Y: ");
            y = teclado.nextDouble();
            r = a * x + b * y + c;
            d = r / (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
            System.out.println("D = " + d);

            if (d == 0) {
                System.out.println("x: " + x + " y: " + y);
                break;
            }
        } while (d != 0);

        teclado.close();
    }
}
