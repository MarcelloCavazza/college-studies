package C06;

import java.util.Scanner;

public class C06EX12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira a quantidade de bolas produzidas: ");
        int bolasQtdTotal = teclado.nextInt();

        System.out.print("Insira a quantidade de bolas com defeito: ");
        int bolasDefeitoQtdTotal = teclado.nextInt();

        System.out.print("Insira o valor de cada caixa: ");
        double precoPorCaixa = teclado.nextDouble();

        System.out.print("Insira a quantidade de meses ate a Copa: ");
        int mesesAteACopa = teclado.nextInt();

        System.out.print("Insira o valor do aluguel: ");
        double aluguelValor = teclado.nextDouble();

        int qtdBolasLiquidas = bolasQtdTotal - bolasDefeitoQtdTotal;

        int quantidadeDeCaixas = qtdBolasLiquidas / 10;
        if(qtdBolasLiquidas % 10 != 0){
            quantidadeDeCaixas += qtdBolasLiquidas % 10;
        }

        int quantidadeDeGalpoes = quantidadeDeCaixas / 850;
        if(quantidadeDeCaixas % 850 != 0){
            quantidadeDeGalpoes += quantidadeDeCaixas % 850;
        }

        double valorTotalDoAlugel = quantidadeDeGalpoes * aluguelValor * mesesAteACopa;

        double precoTotalDasCaixas = bolasQtdTotal*precoPorCaixa;

        double custoTotal = valorTotalDoAlugel + precoTotalDasCaixas;

        System.out.println("Custo total: R$"+String.format("%.2f",custoTotal));


        teclado.close();
    }
}
