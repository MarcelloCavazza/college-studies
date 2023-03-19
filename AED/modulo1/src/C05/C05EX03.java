package C05;

import java.io.Console;
import java.util.Scanner;

public class C05EX03 {
    // Autor: Marcello Henrique Cavazza Oliveira
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o valor do seu salario: ");
        double salario = teclado.nextDouble();
        System.out.print("Insira o número de dependentes: ");
        int numeroDeDependentes = teclado.nextInt();

        double salarioLiquido = (salario - (numeroDeDependentes * 60));
        double resultadoIR = salarioLiquido * 0.15;
        System.out.println("Salário líquido depois de delcarar o Imposto de Renda: "+resultadoIR);
        teclado.close();
    }
}
