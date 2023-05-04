package C11;

import java.util.Scanner;

public class C11EX04b {
    public static void main(String[] args) {
        String nome, sexo, nomev = "";
        int idade, idadev = 0;
        double valor, ptsperdido, somaI = 0, somat = 0, percent, media = 0, cont = 0.0, contm = 0.0, contf = 0.0;
        Scanner teclado = new Scanner(System.in);
        do {
            cont++;
            System.out.print("Digite seu nome: ");
            nome = teclado.nextLine();
            if (!nome.equalsIgnoreCase("X")) {
                System.out.print("Qual o seu sexo  'm'  ou 'f' ");
                sexo = teclado.nextLine();
                System.out.print("Digite sua idade: ");
                idade = teclado.nextInt();
                System.out.print("Digite a quantidade de pontos perdidos: ");
                ptsperdido = teclado.nextDouble();
                System.out.print("Valor da multa: ");
                valor = teclado.nextDouble();
                teclado.nextLine();

                somaI += idade;
                somat += valor;

                if (sexo.equalsIgnoreCase("m")) {
                    contm++;
                }

                if (sexo.equalsIgnoreCase("f") && ptsperdido == 7) {
                    contf++;
                }

                if (cont == 0 || idade > idadev) {
                    idadev = idade;
                    nomev = nome;
                }
            }
        } while (!nome.equalsIgnoreCase("x"));

        percent = (contm / cont) * 100;
        media = somaI / cont;

        System.out.println("Idade média dos condutores: " + media);
        System.out.println("Soma total: " + somat);
        System.out.println("percentual de homens: " + percent + "%");
        System.out.println("Quantidade de mulheres que perderam 7 pontos na carteira: " + contm);
        System.out.println("Nome da pessoa mais velha: " + nomev + "\nidade: " + idadev);
        teclado.close();
    }
}
