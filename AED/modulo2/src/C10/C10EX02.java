package C10;

import java.util.Scanner;

public class C10EX02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valor, soma = 0, cont = 0, media = 0, cont2 = 0;

        do {
            System.out.print("Digite o valor recebido: ");
            valor = teclado.nextDouble();
            cont++;
            soma += valor;
            if (valor > 1000) {
                cont2++;
            }
        } while (valor != 0);

        media = soma / cont;

        System.out.println("valor total recebido: " + soma);
        System.out.println("media dos valores recebidos: " + media);
        System.out.println("Quantidade de valores acima de 1000: " + cont2);

        teclado.close();
    }
}
