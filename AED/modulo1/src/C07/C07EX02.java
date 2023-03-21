package C07;

import java.util.Scanner;

public class C07EX02 {
    public static void main(String[] args) { // Autor: Marcello Henrique Cavazza Oliveira
        String mensagemFinal = "Conceito: ";
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira sua nota1: ");
        int nota1DoAluno = teclado.nextInt();
        System.out.print("Insira sua nota2: ");
        int nota2DoAluno = teclado.nextInt();
        System.out.print("Insira sua nota3: ");
        int nota3DoAluno = teclado.nextInt();
        
        if (nota1DoAluno > 10 || nota1DoAluno < 0 || nota2DoAluno > 10 || nota2DoAluno < 0 || nota3DoAluno > 10
                || nota3DoAluno < 0) {
            System.out.print("Insira somente notas entra 0 e 10");
        } else {
            int media = (nota1DoAluno + nota2DoAluno + nota3DoAluno)/ 3;
            switch (media) {
                case 9:
                case 10:
                    mensagemFinal += "A";
                    break;
                case 8:
                    mensagemFinal += "B";
                    break;
                case 7:
                    mensagemFinal += "C";
                    break;
                case 5: case 6:
                    mensagemFinal += "D";
                    break;
                case 1: case 2: case 3: case 4:
                    mensagemFinal += "E";
                    break;
                default:
                    mensagemFinal = "Erro no sistema";
                    break;
            }
        }

        System.out.print(mensagemFinal);

        teclado.close();

    }
}
