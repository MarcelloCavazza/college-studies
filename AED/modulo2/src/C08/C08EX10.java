package C08;

import java.util.Scanner;

public class C08EX10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numInsumos;
        double precoUnitario, quantidade, custoTotal = 0, maiorCustoParcial = 0, custoParcial, mediaCustosParciais;
        String nome, nomeMaiorCusto = "";
        
        System.out.println("Digite a quantidade de insumos:");
        numInsumos = input.nextInt();
        
        for (int i = 1; i <= numInsumos; i++) {
            System.out.println("Digite o nome do insumo " + i + ":");
            nome = input.nextLine();
            
            System.out.println("Digite o preço unitário do insumo " + i + ":");
            precoUnitario = input.nextDouble();
            
            System.out.println("Digite a quantidade consumida do insumo " + i + ":");
            quantidade = input.nextDouble();
            
            custoParcial = precoUnitario * quantidade;
            custoTotal += custoParcial;
            
            if (custoParcial > maiorCustoParcial) {
                maiorCustoParcial = custoParcial;
                nomeMaiorCusto = nome;
            }
        }
        
        if (numInsumos > 0) {
            mediaCustosParciais = custoTotal / numInsumos;
            System.out.println("O custo total do projeto é: " + custoTotal);
            System.out.println("A média dos custos parciais é: " + mediaCustosParciais);
            System.out.println("O insumo de maior custo parcial é: " + nomeMaiorCusto);
        } else {
            System.out.println("Não há insumos cadastrados.");
        }
        input.close();
    }

}

