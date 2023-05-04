package C11;

import java.util.Scanner;

public class C11EX11 {
    public static void main(String[] args) {
        int numero;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um numero inteiro: ");
        numero = teclado.nextInt();

        for (int aux2 = 1; aux2 <= numero; aux2++) {
            for (int aux = 1; aux <= aux2; aux++) {
                System.out.print(aux2 + " ");
            }
            System.out.println();

        }
        teclado.close();
    }
}
