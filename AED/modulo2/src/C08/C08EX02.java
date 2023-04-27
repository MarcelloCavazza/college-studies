package C08;

import java.util.Scanner;
//Auto: Marcello Henrique Cavazza Oliveira

public class C08EX02 {
    public static void main(String[] args) {
        String mensagemFinal;
        double nota;
        int totalDeFaltas;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("(Se quiser sair insira a nota como -1)");
            System.out.print("Insira o valor da nota do aluno: ");
            nota = input.nextDouble();

            if (nota == -1) {
                break;
            }

            System.out.print("Insira as faltas do aluno: ");
            totalDeFaltas = input.nextInt();


            if (nota >= 65 && totalDeFaltas <= 16) {
                mensagemFinal = "A";
            } else {
                mensagemFinal = "RE";
            }

            System.out.println(mensagemFinal + "PROVADO");
        }

        input.close();
    }
}
