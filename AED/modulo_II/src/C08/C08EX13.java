package C08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class C08EX13 {
    public static void main(String[] args) {
        String arquivo = "cidades.txt";
        int contadorPopulacaoMaior1Milhao = 0;
        int contadorMulheresMaisQueHomens = 0;
        int menorPopulacao = Integer.MAX_VALUE;
        String nomeCidadeMenorPopulacao = "";
        
        try {
            BufferedReader leitor = new BufferedReader(new FileReader(arquivo));
            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] dados = linha.split(";");
                String nomeCidade = dados[0];
                int populacao = Integer.parseInt(dados[1]);
                int eleitores = Integer.parseInt(dados[2]);
                int mulheres = Integer.parseInt(dados[3]);
                int homens = Integer.parseInt(dados[4]);
                
                if (homens + mulheres != populacao) {
                    System.out.println("A soma de homens e mulheres de " + nomeCidade + " difere da população!");
                }
                
                double percentualEleitores = (double) eleitores / populacao * 100;
                System.out.println("Percentual de eleitores em " + nomeCidade + ": " + percentualEleitores + "%");
                
                if (populacao > 1000000) {
                    contadorPopulacaoMaior1Milhao++;
                }
                
                if (mulheres > homens) {
                    contadorMulheresMaisQueHomens++;
                }
                
                if (populacao < menorPopulacao) {
                    menorPopulacao = populacao;
                    nomeCidadeMenorPopulacao = nomeCidade;
                }
            }
            leitor.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        
        System.out.println("Quantidade de cidades com população acima de 1 milhão de habitantes: " + contadorPopulacaoMaior1Milhao);
        System.out.println("Quantidade de cidades cuja população tem mais mulheres: " + contadorMulheresMaisQueHomens);
        System.out.println("Nome da cidade com menor população: " + nomeCidadeMenorPopulacao);
    }
}

