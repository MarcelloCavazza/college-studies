package C07;

import java.util.Scanner;

public class C07EX01 { // Autor: Marcello Henrique Cavazza Oliveira
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira a quanitidade de acertos: ");

        int quanitdadeDeAcertos = teclado.nextInt();
        String mensagemFinal = "";

        switch (quanitdadeDeAcertos){
            case 0: case 1: case 2: case 4: case 5:
                mensagemFinal = "nenhum premio!";
                break;
            case 6: case 7: case 8: case 9: case 10:
                mensagemFinal = "Outro Cartao";
                break;
            case 11:
                mensagemFinal = "R$100,00";
                break;
            case 12:
                mensagemFinal = "R$1.000,00";
                break;
            case 13:
                mensagemFinal = "R$50.000,00";
                break;
            default:
                mensagemFinal = "Erro ao quantificar quantidade de acertos, execute o programa novamente";
                break;
        }
        System.out.println(mensagemFinal);




        teclado.close();
    }
}
