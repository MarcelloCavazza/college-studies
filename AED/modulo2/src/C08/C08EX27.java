package C08;

import java.util.Scanner;

public class C08EX27 {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                for (int k = 0; k <= Math.pow(2, j) - 1; k++) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }

        // Segunda parte da sequência
        for (int i = 4; i >= 0; i--) {

            for (int j = 0; j <= i; j++) {

                for (int k = 0; k <= Math.pow(2, j) - 1; k++) {

                    System.out.print("*");

                }

                System.out.print(" ");

            }
            System.out.println();

        }
    }
}