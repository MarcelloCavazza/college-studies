package C05;

import java.util.Scanner;

public class C05EX10 {
    // Autor: Marcello Henrique Cavazza Oliveira
    public static void main(String[] args) {
        int initialNumber;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira um numero: ");
        initialNumber = teclado.nextInt();

        System.out.print(initialNumber / 10000 + "\n"+
                initialNumber / 1000 % 10 + "\n"+
                initialNumber / 100 % 10 + "\n"+
                initialNumber / 10 % 10 + "\n"+
                initialNumber / 1 % 10);


        teclado.close();
    }
}
