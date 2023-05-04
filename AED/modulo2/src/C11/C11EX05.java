package C11;

import java.util.Scanner;

public class C11EX05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        int opcao;
        double mensalidade = 0, somaI = 0, somaF = 0, somaE = 0, cont = 0, contI = 0, soma = 0, media;

        do {
            cont++;
            System.out.print("Digite seu nome: ");
            nome = teclado.nextLine();
            if (!nome.equalsIgnoreCase("fim")) {
                System.out.print("Digite sua opção de curso: ");
                opcao = teclado.nextInt();
                teclado.nextLine();

                if (opcao == 1) {
                    mensalidade = 100.0;
                    System.out.println("Nome: " + nome + "Mesalidade: " + mensalidade);
                    somaI += mensalidade;
                    contI++;
                } else if (opcao == 2) {
                    mensalidade = 150.0;
                    System.out.println("Nome: " + nome + "Mesalidade: " + mensalidade);
                    somaF += mensalidade;
                } else {
                    mensalidade = 120.0;
                    System.out.println("Nome: " + nome + "Mesalidade: " + mensalidade);
                    somaE += mensalidade;
                }

                soma += mensalidade;
            }
        } while (!nome.equalsIgnoreCase("fim"));
        media = soma / cont;

        System.out.println("A quantidade de alunos matriculados nas turmas de Inglês: " + contI);
        System.out.println("A mensalidade média da escola: " + media);
        System.out.println("O valor total das mensalidades por opção  ingles: " + somaI + "\nFrancês: " + somaF
                + "\nEspanhol: " + somaE);
        teclado.close();
    }
}
