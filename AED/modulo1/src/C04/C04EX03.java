package C04;

import java.util.Scanner;

public class C04EX03 {
    public static void main(String[] args) {
        Double multaInicial, multaMediana, multaFinal,
                poluenteMinimo, poluenteMediano1, poluenteMediano2, poluenteFinal;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira multa inicial: ");
        multaInicial = teclado.nextDouble();
        System.out.print("Insira multa mediana: ");
        multaMediana = teclado.nextDouble();
        System.out.print("Insira multa final: ");
        multaFinal = teclado.nextDouble();

        System.out.print("Insira o valor poluente inicial: ");
        poluenteMinimo = teclado.nextDouble();
        System.out.print("Insira o valor poluente mediano menor: ");
        poluenteMediano1 = teclado.nextDouble();
        System.out.print("Insira o valor poluente mediano maior: ");
        poluenteMediano2 = teclado.nextDouble();
        System.out.print("Insira o poluente final: ");
        poluenteFinal = teclado.nextDouble();

        System.out.println("Quantidade de Poluente Emitido x Valor da Multa"+
                "\nAte "+poluenteMinimo+" multa de R$"+multaInicial+
                "\nEntre "+poluenteMediano1+" e "+poluenteMediano2+" multa de R$"+multaMediana+
                "\nAcima de "+poluenteFinal+" multa de R$"+multaFinal);

    }
}
