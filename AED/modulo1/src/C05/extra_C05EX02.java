package C05;

import java.util.Scanner;

public class extra_C05EX02 {
    public static void main(String[] args) {
        double tempo, tempoRelativo, velocidade, velocidadeDaLuz = 3 * Math.pow(10, 8);
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira o valor do tempo: ");
        tempo = teclado.nextDouble();
        System.out.print("Insira o valor da velocidade: ");
        velocidade = teclado.nextDouble();

        tempoRelativo = tempo * (1 / (Math.sqrt(1 - (Math.pow(velocidade, 2) / Math.pow(velocidadeDaLuz,2)))));

        System.out.println(String.format("%.4f", tempoRelativo));

        teclado.close();
    }
}
