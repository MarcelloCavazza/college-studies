package C06;

import java.util.Scanner;

public class C06EX08 {
    // Autor: Marcello Henrique Cavazza Oliveira
    public static void main(String[] args) {
        String name;
        double alturaMetros, pesoMin, pesoMax;
        final short  imcIdealMax = 25, imcIdealMin = 20;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira a sua altura: ");
        alturaMetros = teclado.nextDouble();

        teclado.nextLine();

        System.out.print("Insira seu nome: ");
        name = teclado.nextLine();

        pesoMin = imcIdealMin * Math.pow(alturaMetros, 2);
        pesoMax = imcIdealMax * Math.pow(alturaMetros, 2);

        System.out.println(name+" seu peso ideal:"+
                "\n-Peso minimo ideal: "+String.format("%.2f", pesoMin)+
                "\n-Peso maximo ideal: "+ String.format("%.2f", pesoMax));

        teclado.close();
    }
}
