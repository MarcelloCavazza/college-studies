package C11;

import java.util.Scanner;

public class C11EX02B {
    public static void main(String[] args) {
        double cont = 0, prata = 0, ouro = 0, bronze = 0, somab = 0, somat = 0, valorMenor = 0;
        String nome, nomeMenor = "", clas = "";
        Scanner teclado = new Scanner(System.in);
        do {
            cont++;
            System.out.print("Digite seu nome: ");
            nome = teclado.nextLine();
            if (!nome.equalsIgnoreCase("X")) {
                System.out.print("Digite o valor aplicado: ");
                double valorAplicado = teclado.nextDouble();
                teclado.nextLine();

                if (valorAplicado <= 1000) {
                    bronze++;
                    clas = "Bronze";
                    somab += valorAplicado;
                } else if (valorAplicado <= 5000) {
                    prata++;
                    clas = "prata";
                } else {
                    ouro++;
                    clas = "ouro";
                }

                somat += valorAplicado;

                if (cont == 0 || valorAplicado < valorMenor) {
                    valorMenor = valorAplicado;
                    nomeMenor = nome;
                }

                System.out.println("Nome: " + nome + "\nClasificação: " + clas);
            }
        } while (!nome.equalsIgnoreCase("x"));

        double media = somab / bronze;

        System.out.println("\nQuantidade de bronze: " + bronze);
        System.out.println("Quantidade de prata: " + prata);
        System.out.println("Quantidade de ouro: " + ouro);
        System.out.println("Media investimento bronze: " + media);
        System.out.printf("Quantidade total de investimento: %.2f", somat);
        System.out.println("Nome do cliente com a menor aplicação: " + nomeMenor + "Aplicação: " + valorMenor);

        teclado.close();
    }
}
