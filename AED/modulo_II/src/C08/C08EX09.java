package C08;
import java.util.Scanner;

public class C08EX09 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numPessoas, idade, somaIdadeHomens = 0, somaIdadeMulheres = 0, qtdHomens = 0, qtdMulheres = 0;
        String nome, sexo;
        
        System.out.println("Digite a quantidade de pessoas:");
        numPessoas = input.nextInt();
        
        for (int i = 1; i <= numPessoas; i++) {
            System.out.println("Digite o nome da pessoa " + i + ":");
            nome = input.nextLine();
            
            System.out.println("Digite a idade da pessoa " + i + ":");
            idade = input.nextInt();
            
            System.out.println("Digite o sexo da pessoa " + i + " (M/F):");
            sexo = input.next();
            
            if (sexo.equalsIgnoreCase("M")) {
                somaIdadeHomens += idade;
                qtdHomens++;
            } else if (sexo.equalsIgnoreCase("F")) {
                somaIdadeMulheres += idade;
                qtdMulheres++;
            } else {
                System.out.println("Sexo inválido. Tente novamente.");
                i--;
            }
        }
        
        if (qtdHomens > 0) {
            double mediaIdadeHomens = (double) somaIdadeHomens / qtdHomens;
            System.out.println("A idade média dos homens é: " + mediaIdadeHomens);
        } else {
            System.out.println("Não há homens cadastrados.");
        }
        
        if (qtdMulheres > 0) {
            double mediaIdadeMulheres = (double) somaIdadeMulheres / qtdMulheres;
            System.out.println("A idade média das mulheres é: " + mediaIdadeMulheres);
        } else {
            System.out.println("Não há mulheres cadastradas.");
        }
        input.close();
    }

}

