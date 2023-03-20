package C06;

import java.util.Scanner;

public class C06EX16 {    // Autor: Marcello Henrique Cavazza Oliveira

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira a quantidade de faltas: ");
        int faltas = teclado.nextInt();

        System.out.print("Insira a nota da prova1: ");
        double prova1 = teclado.nextDouble();
        System.out.print("Insira a nota da prova2: ");
        double prova2 = teclado.nextDouble();
        System.out.print("Insira a nota da prova3: ");
        double prova3 = teclado.nextDouble();

        System.out.print("Insira a nota do trabalho: ");
        double trabalho = teclado.nextDouble();

        System.out.print("Insira a idade do aluno: ");
        int idade = teclado.nextInt();

        int peso1 = 1, peso2 = 1;

        if(faltas <= 5){
            peso1 = 3;
        } else if (faltas > 5 && faltas <= 10) {
            peso1 = 2;
        }else{
            peso1 = 1;
        }

        if(idade <= 17){
            peso2 = 1;
        } else if (idade > 18 && idade <= 50) {
            peso2 = 2;
        }else{
            peso2 = 3;
        }

        double maiorNota1, maiorNota2;

        if(prova1 > prova2 && prova1 > prova3){
            maiorNota1 = prova1;
        } else if (prova2 > prova1 && prova2 > prova3) {
            maiorNota1 = prova2;
        }else{
            maiorNota1 = prova3;
        }

        if ((prova1 > prova2 && prova1 < prova3) || (prova1 < prova2 && prova1 > prova3)) {
            maiorNota2 = prova1;
        } else if ((prova2 > prova1 && prova2 < prova3) || (prova2 < prova1 && prova2 > prova3)) {
            maiorNota2 = prova2;
        } else {
            maiorNota2 = prova3;
        }



        double mediaDuasMaioresNotas = maiorNota2 + maiorNota1 / 2.0;

        double notaFinal = mediaDuasMaioresNotas * peso1 + trabalho * peso2;

        String statusDoAluno = "";

        if(notaFinal < 50){
            statusDoAluno = "Reprovado";
        } else if (notaFinal > 50 && notaFinal <= 70) {
            statusDoAluno = "Regular";
        } else if (notaFinal > 70 && notaFinal <= 80) {
            statusDoAluno = "Bom";
        } else if (notaFinal > 80 && notaFinal <= 90) {
            statusDoAluno = "Muito Bom";
        }else{
            statusDoAluno = "Excelente";
        }

        System.out.println(statusDoAluno);

        teclado.close();
    }
}
