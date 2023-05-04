package C08;

import java.util.Scanner;

public class C08EX23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double soma = 0, media = 0;
        int cont = 0;
        for (int aux = 1000; aux < 9999; aux++) {
            if (aux / 1000 == aux % 10 && (aux / 100) % 10 == (aux / 10) % 10) {
                System.out.println(aux);
                soma += aux;
                cont++;
            }

            media = soma / cont;

        }
        System.out.println("Soma:  " + media);

        teclado.close();
    }
}
