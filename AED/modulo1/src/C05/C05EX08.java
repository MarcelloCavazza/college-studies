package C05;

import java.util.Scanner;

public class C05EX08 {
    // Autor: Marcello Henrique Cavazza Oliveira
    public static void main(String[] args) {
        double setor, angulo, raio;
        final double pi = 3.1416;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o valor da area do setor circular: ");
        setor = teclado.nextDouble();
        System.out.print("Insira o valor do angulo: ");
        angulo = teclado.nextDouble();

        raio = Math.sqrt(((setor*360)/angulo)/pi);

        System.out.print("O valor do raio eh "+raio);

        teclado.close();
    }
}
