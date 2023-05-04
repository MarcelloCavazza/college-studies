package C08;

import java.util.Scanner;

public class C08EX24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double primeiraParte = 0;

        for (int aux = 0; aux < 98; aux++) {
            primeiraParte += Math.pow(2, aux + 1);
        }

        double serie = (1.0 / 3.0) * primeiraParte;

        System.out.println("Valor da Serie: " + serie);

        teclado.close();
    }
}
