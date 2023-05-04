package C08;

import java.util.Scanner;

public class C08EX26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        for (int aux2 = 1; aux2 <= 10; aux2++) {

            for (int aux = 1; aux <= aux2; aux++)
                System.out.print(" ");

            System.out.print("*");
            System.out.println();
        }

        for (int aux2 = 10; aux2 >= 1; aux2--) {

            for (int aux = 1; aux <= aux2; aux++)
                System.out.print(" ");

            System.out.print("*");
            System.out.println();
        }

        teclado.close();
    }
}
