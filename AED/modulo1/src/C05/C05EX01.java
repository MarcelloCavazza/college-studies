package C05;

import java.util.Scanner;

public class C05EX01 {
    // Autor: Marcello Henrique Cavazza Oliveira
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o valor do raio: ");
        int x = teclado.nextInt();
        double fx = Math.pow(x,3) + 4*x+10;

        System.out.println("Resultado de f("+x+") = "+ fx);
        teclado.close();
    }
}
