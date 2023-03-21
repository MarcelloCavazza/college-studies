package C07;

import java.util.Scanner;

public class C07EX03 {
    public static void main(String[] args) {
        String mensagemFinal = "Multa = R$ ";
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira quantos dias houve de atraso: ");
        int diasAtraso = teclado.nextInt();
        
        System.out.print("Insira o valor do imposto: ");
        double imposto = teclado.nextDouble();

        switch (diasAtraso) {
            case 1: case 2: case 3: case 4: case 5:
                mensagemFinal = "0,00";
                break;
            case 6: case 7: case 8:
                mensagemFinal += String.format("%.2f", imposto*0.02+"");
                break;
            case 9: case 10:
                mensagemFinal += String.format("%.2f", imposto*0.1+imposto*0.05*diasAtraso+"");
                break;
            case 1: case 2: case 3: case 4: case 5:
                mensagemFinal = "Insento de multa";
                break;
            default:
                break;
        }
    }
}
