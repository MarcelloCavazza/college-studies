package C05;

import java.util.Scanner;

public class C05EX11 {
    // Autor: Marcello Henrique Cavazza Oliveira
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o numero do banco: ");
        int numeroDoBanco = teclado.nextInt();

        System.out.println("Numero do cheque do Banco: "+numeroDoBanco+
                "\nBanco: "+numeroDoBanco / 1000000+
                "\nAgencia: "+numeroDoBanco / 1000 %1000+
                "\nSequencial: "+numeroDoBanco / 1 %1000);
    }
}
