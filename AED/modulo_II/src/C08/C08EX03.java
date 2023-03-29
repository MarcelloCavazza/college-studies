package C08;

import java.util.Scanner;
//Auto: Marcello Henrique Cavazza Oliveira

public class C08EX03 {
    public static void main(String[] args) {
        String statusDoALuno;
        double nota;
        int totalDeFaltas, qttdAprovados = 0, loppsRealizados = 0;
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 50; i++) {
            System.out.println("(Se quiser sair insira a nota como -1)");
            System.out.print("Insira o valor da nota do aluno: ");
            nota = teclado.nextDouble();

            if (nota == -1) {
                break;
            }
            loppsRealizados++;

            System.out.print("Insira as faltas do aluno: ");
            totalDeFaltas = teclado.nextInt();


            if (nota >= 65 && totalDeFaltas <= 16) {
                statusDoALuno = "A";
                qttdAprovados++;
            } else {
                statusDoALuno = "Re";
            }

            System.out.println(statusDoALuno + "provado!");
        }

        System.out.println("Quantidade de alunos reprovados:" + (loppsRealizados - qttdAprovados) +
                "\n Quantidade de alunos aprovados" + qttdAprovados);

        teclado.close();
    }
}
