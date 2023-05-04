package C11;

import java.util.Scanner;

public class C11EX07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double dia, temperatura, cont = 0, temperaturaMenor = 0, temperaturaMaior = 0, cont2 = 0, soma = 0, media;

        do {
            cont++;
            System.out.print("Digite o dia: ");
            dia = teclado.nextDouble();
            System.out.print("Temperatura do dia: ");
            temperatura = teclado.nextDouble();

            if (cont == 0 || temperatura < temperaturaMenor) {
                temperaturaMenor = temperatura;
            }

            if (cont == 0 || temperatura > temperaturaMaior) {
                temperaturaMaior = temperatura;
            }

            soma += temperatura;

            if (temperaturaMaior == temperatura) {
                cont2++;
            }

        } while (cont < 5);

        media = soma / cont;

        System.out.println("Dia da maior temperatura: " + temperaturaMaior);
        System.out.println("Dia da menor temperatura: " + temperaturaMenor);
        System.out.println("Media: " + media);
        System.out.println("Dia da maior temperatura Repetidos: " + cont2);
        teclado.close();
    }
}
