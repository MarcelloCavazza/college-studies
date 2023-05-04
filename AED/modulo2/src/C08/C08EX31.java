package C08;

import java.util.Scanner;

public class C08EX31 {
    public static void main(String[] args) {
        int quantidadeEngenheiros, cont = 0, cont2 = 0, cont3 = 0;
        double soma = 0, cargoMenor = 0, menor = 0, media = 0;
        String nomeMenor = "";

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a quantidade de engenheiros entrevistados: ");
        quantidadeEngenheiros = teclado.nextInt();

        for (int aux = 1; aux < quantidadeEngenheiros; aux++) {
            teclado.nextLine();
            System.out.print("Digite seu nome: ");
            String nome = teclado.nextLine();

            System.out.print("Digite o valor do seu salario: ");
            double salario = teclado.nextDouble();

            System.out.print("Digite seu cargo (A=1; P=2; C=3; X=4): ");
            int cargo = teclado.nextInt();

            teclado.nextLine();

            if (salario < 5000) {
                System.out.println("Salário abaixo do minimo");
            }

            if (salario >= 5000) {
                cont++;
            }

            if (cargo == 4 && salario > 5000) {
                cont2++;
            }

            if (cargo == 1) {
                soma += salario /
                        cont3++;
            }

            if (aux == 1 || salario > menor) {
                menor = salario;
                nomeMenor = nome;
                cargoMenor = cargo;
            }
        }

        media = soma / cont3;

        System.out.println("Média dos salários dos Administradores = " + media);
        System.out.println("Quantidade de salários acima do mínimo = " + cont);
        System.out.println("Quantidade de engenheiros de cargo 'Outros' que recebem acima de R$5000 = " + cont2);
        System.out.println("Nome, cargo e salário do engenheiro de menor salário = " + nomeMenor + "Cargo: "
                + cargoMenor + "Salário R$: " + menor);

        teclado.close();
    }
}
