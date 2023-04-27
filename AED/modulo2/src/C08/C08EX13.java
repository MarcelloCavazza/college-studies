package C08;

import java.io.IOException;
import java.util.Scanner;

public class C08EX13 {
    public static void main(String[] args) throws IOException {
        Scanner arquivo = new Scanner(C08EX13.class.getResourceAsStream("c08ex13.txt"));
        String linhaDoArquivo = "", nomeCidade = "", menorCidade = "";
        double porcentagemDePessoasQueVotam;
        int totalHomens = 0, totalmulheres = 0, populacao = 0,
                quantidadeEleitores = 0, acimaDe1Milhao = 0, maioriaMulher = 0, menorPop = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                linhaDoArquivo = arquivo.nextLine();
                switch (j+1){
                    case 1:
                        nomeCidade = linhaDoArquivo;
                        break;
                    case 2:
                        populacao = Integer.parseInt(linhaDoArquivo.replaceAll("\\.",""));
                        break;
                    case 3:
                        quantidadeEleitores = Integer.parseInt(linhaDoArquivo.replaceAll("\\.",""));
                        break;
                    case 4:
                        totalHomens = Integer.parseInt(linhaDoArquivo.replaceAll("\\.",""));
                        break;
                    default:
                        totalmulheres =  Integer.parseInt(linhaDoArquivo.replaceAll("\\.",""));
                        break;
                }
            }
            boolean populacaoEhCoeza = (totalHomens + totalmulheres) != populacao;
            if(populacaoEhCoeza) System.out.println(
                    nomeCidade+": O total de homens e mulheres juntons diferem da populacao total!"
            );
            porcentagemDePessoasQueVotam = (quantidadeEleitores *100.0) / populacao;
            System.out.println(nomeCidade+": Porcentagem de pessoas que votam: "+String.format("%.0f",porcentagemDePessoasQueVotam)+"%");
            if(populacao > 1000000 && populacaoEhCoeza) acimaDe1Milhao++;
            if(totalmulheres > totalHomens && populacaoEhCoeza) maioriaMulher++;
            if(populacao < menorPop) {
                menorPop = populacao;
                menorCidade = nomeCidade;
            };
        }
        System.out.println("-----------------------------------------------------\n"
        +"-----------------------------------------------------");
        System.out.println("Quantidade de cidades com mais de 1 milhao de pessoas: "+acimaDe1Milhao);
        System.out.println("Quantidade de cidades com maioria mulheres: "+maioriaMulher);
        System.out.println("Cidade com menor populacao "+menorCidade);
        arquivo.close();
    }
}

