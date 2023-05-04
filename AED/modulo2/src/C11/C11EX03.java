package C11;

import java.util.Scanner;

public class C11EX03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double dia, valor = 0, cont = 0, soma = 0;
        do {
            System.out.print("Qual foi o dia da multa: ");
            dia = teclado.nextInt();
            if (dia != 99) {
                teclado.nextLine();
                System.out.print("Qual a placa do carro: ");
                String placa = teclado.nextLine();
                System.out.print("Digite a quantidade de Pontos: ");
                int pontos = teclado.nextInt();

                if (pontos == 3) {
                    valor = 42;
                } else if (pontos == 5) {
                    valor = 108;
                } else {
                    valor = 479;
                }

                if (dia <= 15 && pontos == 8) {
                    cont++;
                }

                soma += valor;
                System.out.println("Placa: " + placa + "\n valor: " + valor);
            }
        } while (dia != 99);

        System.out.println("A quantidade de multas de pontuação 8 da primeira quinzena do mês: " + cont);
        System.out.println("O valor total arrecadado com as multas: " + soma);
        teclado.close();
    }
}
