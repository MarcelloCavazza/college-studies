package C08;

import java.util.Scanner;

public class C08EX04 {
    public static void main(String[] args) {
        String nome;
        int idade, loopsRealizados = 0, qttAcimaDe18 = 0;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 50; i++) {
            System.out.println("(Insira a idade como -1 para sair do App)");
            System.out.print("Insira a idade: ");
            idade = input.nextInt();

            if (idade == -1) {
                break;
            }

            loopsRealizados++;
            input.nextLine();
            System.out.print("Insira o seu nome: ");
            nome = input.nextLine();
            if (idade > 18) {
                qttAcimaDe18++;
            }

            System.out.println("Nome: " + nome + " Idade: " + idade);
        }

        System.out.println("Ate 18 -> " + (loopsRealizados - qttAcimaDe18) +
                "\nAcima de 18 -> " + qttAcimaDe18);

        input.close();
    }
}
