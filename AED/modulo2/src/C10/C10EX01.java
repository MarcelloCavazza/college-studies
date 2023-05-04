package C10;

import java.util.Scanner;

public class C10EX01 {
    public static void main(String[] args) {
        double multa, valor;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Digite o valor da Multa: ");
            valor = teclado.nextDouble();

            multa = (1.0 / 10.0) * valor;

            System.out.println("Multa: " + multa);
        } while (multa == -1);

        teclado.close();
    }
}
