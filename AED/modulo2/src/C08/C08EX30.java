package C08;

import java.util.Scanner;

public class C08EX30 {
    public static void main(String[] args) {
        double primeiraParte = 0, den, div;
        int aux;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor de x: ");
        int x = teclado.nextInt();

        System.out.print("Digite o valor de n: ");
        int n = teclado.nextInt();

        for (aux = 1; aux <= n; aux++) {
            den = Math.pow(x, aux);
            div = aux;

            primeiraParte += den / div;
        }

        double serie = Math.log(x) + primeiraParte;
        System.out.println("S: " + serie);

        teclado.close();
    }
}
