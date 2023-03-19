package C04;

import java.util.Scanner;

public class C04EX01 {
    // Autor: Marcello Henrique Cavazza Oliveira
    public static void main(String[] args) {
        String primeiroNome, segundoNome, ultimoNome;
        int idade;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira seu primeiro nome:");
        primeiroNome = teclado.nextLine();
        System.out.print("Insira seu nome do meio:");
        segundoNome = teclado.nextLine();
        System.out.print("Insira seu último nome:");
        ultimoNome = teclado.nextLine();
        System.out.print("Idade:");
        idade = teclado.nextInt();

        System.out.println(ultimoNome+", "+ primeiroNome + " "+ segundoNome +
                "\nIdade: "+ idade + "anos.");
        teclado.close();
    }
}
