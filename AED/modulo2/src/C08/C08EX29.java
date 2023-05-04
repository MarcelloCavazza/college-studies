package C08;

import java.util.Scanner;

public class C08EX29 {
    public static void main(String[] args) {
        int resultado = 0, x = 0, y = 0, multi = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um numero: ");
        x = teclado.nextInt();
        System.out.print("Informe um numero: ");
        y = teclado.nextInt();

        for (int aux = 1; aux <= y; aux++) {

            if (aux == 1) {
                resultado = x;
            } else {
                resultado *= x;

            }
        }
        System.out.println("Resultado: " + resultado);
        teclado.close();
    }
}
