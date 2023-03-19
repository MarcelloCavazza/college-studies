package C05;

import java.util.Scanner;

public class C05EX12 {
    // Autor: Marcello Henrique Cavazza Oliveira
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira o valor em segundos: ");
        int valorInicialEmSegundos = teclado.nextInt();

        int horas = valorInicialEmSegundos / 3600;
        int minutos = valorInicialEmSegundos % 3600 / 60;
        int segundos = valorInicialEmSegundos % 3600 % 60;

        System.out.println(valorInicialEmSegundos+"seg eh equivalente ah "+horas+"h "+minutos+"min e "+segundos+"seg");
        teclado.close();
    }
}
