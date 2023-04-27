package C08;
import java.util.Scanner;

public class C08EX08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota, somaNotas = 0;
        int faltas, aprovados = 0, reprovados = 0, maisDezesseisFaltas = 0;
        
        for (int i = 1; i <= 3; i++) {
            System.out.println("Digite a nota final do aluno " + i + ":");
            nota = input.nextDouble();
            
            System.out.println("Digite o número de faltas do aluno " + i + ":");
            faltas = input.nextInt();
            
            if (nota >= 65 && faltas <= 16) {
                System.out.println("Aluno " + i + " aprovado!");
                aprovados++;
                somaNotas += nota;
            } else {
                System.out.println("Aluno " + i + " reprovado!");
                reprovados++;
            }
            
            if (faltas > 16) {
                maisDezesseisFaltas++;
            }
        }
        
        if (aprovados > 0) {
            double mediaNotasAprovados = somaNotas / aprovados;
            System.out.println("A média das notas dos alunos aprovados é: " + mediaNotasAprovados);
        } else {
            System.out.println("Não há alunos aprovados.");
        }
        
        System.out.println("A quantidade de alunos com mais de 16 faltas é: " + maisDezesseisFaltas);
        input.close();
    }

}
