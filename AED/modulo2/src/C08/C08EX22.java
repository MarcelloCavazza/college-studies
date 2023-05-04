package C08;

import java.util.Scanner;

public class C08EX22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int aux = 2;

        System.out.println("Digite um número inteiro: ");
        int numero = teclado.nextInt();

        for (aux = 2; aux < numero; aux++) {
            if (numero % aux == 0) {
                System.out.println("não é um número primo");
                break;
            }
        }
        if (aux == numero) {
            System.out.println(numero + " é primo");
        }

        teclado.close();
    }
}
