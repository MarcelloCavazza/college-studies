package C08;

import java.util.Scanner;

//Auto: Marcello Henrique Cavazza Oliveira
public class C08EX01 {
    public static void main(String[] args) {
        double raio, area;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Insira o valor do raio: ");
            raio = input.nextDouble();
            area = 3.1416 * Math.pow(raio, 2);

            System.out.println("Area do quadrado: " + area);
        }

        input.close();
    }
}
