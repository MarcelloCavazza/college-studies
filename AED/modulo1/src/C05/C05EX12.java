package C05;

import java.util.Scanner;

public class C05EX12 {
    // Autor: Marcello Henrique Cavazza Oliveira
    public static void main(String[] args) {
        int segundos = 0, minutos = 0, horas= 0, valorInicialEmSegundos;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira o valor em segundos: ");
        valorInicialEmSegundos = teclado.nextInt();

        horas = valorInicialEmSegundos / 3600;
        minutos = valorInicialEmSegundos % 3600 / 60;
        segundos = valorInicialEmSegundos % 3600 % 60;

        System.out.println(valorInicialEmSegundos+"seg eh equivalente ah "+horas+"h "+minutos+"min e "+segundos+"seg");
        teclado.close();
    }
}
