package C08;

import java.util.Scanner;

public class C08EX18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira um numero: ");
        int numeroEscolhido = teclado.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numeroEscolhido+" * "+i+" = " + numeroEscolhido * i);
        }
        teclado.close();
    }
}
