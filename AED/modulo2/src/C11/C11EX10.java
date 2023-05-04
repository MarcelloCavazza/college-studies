package C11;

import java.util.Scanner;

public class C11EX10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor: ");
        int valor = teclado.nextInt();
        for (int aux2 = 1; aux2 <= valor; aux2++) {
            for (int aux = 1; aux <= aux2; aux++) {
                System.out.print("EMGE" + " ");
            }
            System.out.println();
        }

        teclado.close();
    }
}
