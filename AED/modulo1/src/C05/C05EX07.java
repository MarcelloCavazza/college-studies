package C05;

import java.util.Scanner;

public class C05EX07 {
    // Autor: Marcello Henrique Cavazza Oliveira
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira o valor de X: ");
        double x = teclado.nextDouble();

        double fx = Math.sqrt(Math.pow((x/4+1),2)+1/5*x);

        System.out.println("Resultado final: "+fx);

        teclado.close();
    }
}
