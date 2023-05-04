package C08;

import java.util.Scanner;

public class C08EX21 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String situacao = "";
        System.out.print("Digite sua alturam em metros ");
        double altura = teclado.nextDouble();

        for (int aux = 60; aux <= 100; aux++) {
            double imc = aux / Math.pow(altura, 2);
            System.out.println("Peso: " + aux + "kg Imc: " + imc + "  Situação: " + situacao);
            if (imc < 20) {
                situacao = "abaixo do peso";
            } else if (imc < 26) {
                situacao = "peso ideal";
            } else {
                situacao = "acima do peso";
            }
        }

        teclado.close();
    }
}
