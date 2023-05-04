package C11;

import java.util.Scanner;

public class C11EX06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int oneoff;
        double pessoaswatch, canal, soma4 = 0, soma7 = 0, soma12 = 0, percent4 = 0, percent7 = 0, percent12 = 0, somat,
                cont = 0, cont2 = 0, media;

        do {
            cont++;
            do {
                System.out.print("Digite se a tv estava ligado (1) ou desligada(2): ");
                oneoff = teclado.nextInt();
            } while (oneoff != 1);
            if (oneoff != 3) {
                System.out.print("Digite o canal assistido: ");
                canal = teclado.nextDouble();
                System.out.print("Digite o número de pessoas que estavam assistindo: ");
                pessoaswatch = teclado.nextDouble();

                if (oneoff == 1 && canal == 4) {
                    soma4 += pessoaswatch;
                } else if (oneoff == 1 && canal == 7) {
                    soma7 += pessoaswatch;
                } else if (oneoff == 1 && canal == 12) {
                    soma12 += pessoaswatch;
                }

                if (oneoff == 1) {
                    cont2++;
                }
            }
        } while (oneoff != 3);

        somat = soma12 + soma7 + soma4;
        percent4 = (soma4 / somat) * 100;
        percent7 = (soma7 / somat) * 100;
        percent12 = (soma12 / somat) * 100;
        media = somat / cont2;

        System.out.println("Audiencia total= " + somat);
        System.out
                .println("Porcentagem de cada canal pesquisado 4: " + percent4 + "7: " + percent7 + "12: " + percent12);
        if (soma12 > soma4 && soma12 > soma7) {
            System.out.println("Canal mais assistido é o 12");
        } else if (soma7 > soma4 && soma12 < soma7) {
            System.out.println("Canal mais assistido é o 7");
        } else {
            System.out.println("Canal mais assistido é o 4");
        }
        System.out.println("Media de pessoas= " + media);

        teclado.close();
    }
}
