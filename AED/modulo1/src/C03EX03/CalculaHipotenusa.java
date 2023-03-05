package C03EX03;

import java.util.Scanner;

public class CalculaHipotenusa {
    // Função: Calcula a hipotenusa com o valor de dois catetos
    // Autor: Marcello Henrique Cavazza Oliveira
    public static void main(String[] args) {
        double hipotenusa, cateto1, cateto2;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o valor do cateto 1: ");
        cateto1 = teclado.nextDouble();
        System.out.print("Informe o valor do cateto 2: ");
        cateto2 = teclado.nextDouble();
        hipotenusa = Math.pow(Math.pow(cateto1,2)+Math.pow(cateto2,2),1.0/2);
        System.out.print("Hipotenusa = "+hipotenusa);
        teclado.close();
    }
}
