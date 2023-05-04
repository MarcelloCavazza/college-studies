package C11;

import java.util.Scanner;

public class C11EX14 {
    public static void main(String[] args) {

        int cont = 0;
        double num, den, soma = 0;
        int sinal = 1;

        do {
            cont++;

            num = 1;
            den = cont * 2 - 1;
            soma += num * sinal / den;
            sinal = -sinal;

        } while (soma * 4 < 3.1416 || soma * 4 > 3.1417);

        System.out.println(cont);
    }

}
