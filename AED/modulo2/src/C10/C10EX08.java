package C10;

import java.util.Scanner;

public class C10EX08 {
    public static void main(String[] args) {
        String cidadeMenor = "", nomeCidade;
        int mediaHomens, contHomens = 0, contCidadesMaisMulheres = 0, populacao, numEleitores,
                quantMulheres, quantHomens, contCidade = 0;
        double porcentualEleitores = 0, somaEleitores = 0, somaPopulacao = 0;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Informe o nome da cidade: ");
            nomeCidade = teclado.nextLine();
            contCidade++;
            System.out.print("Informe a população da cidade: ");
            populacao = teclado.nextInt();
            somaPopulacao += populacao;
            System.out.print("Informe o número de eleitores: ");
            numEleitores = teclado.nextInt();
            somaEleitores += numEleitores;
            System.out.print("Informe a quantidade de mulheres: ");
            quantMulheres = teclado.nextInt();
            System.out.print("Informe a quantidade de homens: ");
            quantHomens = teclado.nextInt();
            teclado.nextLine();
            contHomens += quantHomens;

            if (quantMulheres + quantHomens != populacao) {
                System.out.println("A soma dos homens mais as mulheres é diferente da população da cidade");
            }

            if (quantMulheres > quantHomens) {
                contCidadesMaisMulheres++;
            }

        } while (!nomeCidade.equalsIgnoreCase("Zimbabue de Minas"));

        if (populacao < somaPopulacao) {
            cidadeMenor = nomeCidade;
        }

        mediaHomens = contHomens / contCidade;
        System.out.println("b) Quantidade total de cidades do estado: " + contCidade);
        System.out.println("c) População total do estado: " + somaPopulacao);
        porcentualEleitores = ((somaEleitores / somaPopulacao) * 100.0);
        System.out
                .println("d) Percentual de eleitores (em relação a população total do estado): " + porcentualEleitores);
        System.out.println("e) Quantidade de cidades cuja população tem mais mulheres: " + contCidadesMaisMulheres);
        System.out.println("f) Média de homens (em relação a todas as cidades pesquisadas): " + mediaHomens);
        System.out.println("g) O nome da cidade de menor população do estado: " + cidadeMenor);
        teclado.close();

    }
}
