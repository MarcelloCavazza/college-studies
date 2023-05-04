package C11;

import java.util.Scanner;;

public class C11EX12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;

        do {
            System.out.print("Digite um número inteiro entre 1 e 9: ");
            num = teclado.nextInt();
        } while (num < 1 || num > 9);

        for (int aux2 = 1; aux2 <= num; aux2++) {
            for (int aux = 1; aux <= aux2; aux++) {
                System.out.print(aux);
            }
            for (int aux = aux2 - 1; aux >= 1; aux--) {
                System.out.print(aux);
            }
            System.out.println();
        }
        teclado.close();
    }
}