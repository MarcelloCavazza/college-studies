package C10;

import java.util.Scanner;

public class C10EX07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double populacao, doentes = 1, cont = 0, mes = 0, ano = 0;

        System.out.print("Digite o tamanho da população");
        populacao = teclado.nextDouble();

        while (populacao > doentes) {
            cont++;
            doentes += doentes * (0.3 / 100);
        }

        while (cont >= 365) {
            ano++;
            cont -= 365;
        }

        while (cont >= 30) {
            mes++;
            cont -= 30;
        }

        System.out.printf("Levara anos %.0f Mês %.0f e Dias %.0f ", ano, mes, cont);
        teclado.close();
    }
}
