package C08;

import java.util.Scanner;

public class C08EX20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira um numero: ");
        int qtdTermos = teclado.nextInt();
        for (int i = 1; i <= qtdTermos; i++) {
            System.out.println(i);
        }

        teclado.close();
    }
}
