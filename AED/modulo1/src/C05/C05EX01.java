package C05;

import java.util.Scanner;

public class C05EX01 {
    // Autor: Marcello Henrique Cavazza Oliveira
    public static void main(String[] args) {
        int x;
        double fx;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o valor do raio: ");
        x = teclado.nextInt();
        fx = Math.pow(x,3) + 4*x+10;

        System.out.println("Resultado de f("+x+") = "+ fx);
        teclado.close();
    }
}
