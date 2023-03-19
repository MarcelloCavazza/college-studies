package C06;

import java.util.Scanner;

public class C06EX07 {
    // Autor: Marcello Henrique Cavazza Oliveira
    public static void main(String[] args) {
        double salario, plLiquido, plBruto, impostoDeRenda;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira o salario: ");
        salario = teclado.nextDouble();

        if(salario <= 300){
            plBruto = 500+ salario*0.7;
            impostoDeRenda = plBruto * 0.25;
        }else if(salario > 300 && salario <= 1000){
            plBruto = 200+ salario*0.5;
            impostoDeRenda = plBruto * 0.25;
        }else{
            plBruto = salario*0.3;
            impostoDeRenda = plBruto * 0.25;
        }
        plLiquido = plBruto - impostoDeRenda;

        System.out.printf("PL Liquido: %.2f", plLiquido);

        teclado.close();
    }
}
