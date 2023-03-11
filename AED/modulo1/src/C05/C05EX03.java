package C05;

import java.io.Console;
import java.util.Scanner;

public class C05EX03 {
    public static void main(String[] args) {
        double salario, resultadoIR, salarioLiquido;
        int numeroDeDependentes;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o valor do seu salario: ");
        salario = teclado.nextDouble();
        System.out.print("Insira o número de dependentes: ");
        numeroDeDependentes = teclado.nextInt();

        salarioLiquido = (salario - (numeroDeDependentes * 60));
        resultadoIR = salarioLiquido * 0.15;
        System.out.println("Salário líquido depois de delcarar o Imposto de Renda: "+resultadoIR);
        teclado.close();
    }
}
