package C11;

import java.util.Scanner;

public class C11EX01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numerofinal, fx, x, soma = 0, cont = 0;

        System.out.print("Digite o número maior da divisão: ");
        numerofinal = teclado.nextDouble();

        x = 1;

        while (x <= numerofinal) {
            fx = Math.pow(x, 2) + (((4 * x) - 2) / 5);
            System.out.println("F(x): " + fx);

            cont++;
            soma += fx;
            x += 2;
        }
        double media = soma / cont;
        System.out.println("Media: " + media);
        teclado.close();
    }
}
