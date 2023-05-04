package C11;

import java.util.Scanner;

public class C11EX09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome, nomeold = "", nomenew = "";
        int rf, p1, p2, p3;
        double cont = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, old1 = 0, old2 = 0;
        do {
            System.out.print("Digite seu nome: ");
            nome = teclado.nextLine();
            System.out.print("Digite seu RF: ");
            rf = teclado.nextInt();
            if (rf != 000000) {
                teclado.nextLine();

                p1 = rf / 10000;
                p2 = rf % 10000 / 1000;
                p3 = rf % 1000;

                if (p1 > 14 || p1 < 10 || p2 >= 4 || p2 < 1 || rf < 100000 || rf > 999999) {
                    System.out.println("REGISTRO INVALIDO");
                }

                if (p2 == 1) {
                    cont++;
                } else if (p2 == 2) {
                    cont2++;
                } else if (p2 == 1) {
                    cont3++;
                } else if (p2 == 4) {
                    cont4++;
                }

                if (p1 == 10 && p2 == 2) {
                    cont5++;
                }

                if (cont == 0 || p1 >= old1) {
                    old1 = p1;
                    nomeold = nome;
                }

                if (cont == 0 || p1 <= old2) {
                    old2 = p1;
                    nomenew = nome;
                }
            }
        } while (rf != 000000);

        if (cont > cont2 && cont > cont3 && cont > cont4) {
            System.out.println("Setor com mais pessoas é o 1");
        } else if (cont2 > cont && cont2 > cont3 && cont2 > cont4) {
            System.out.println("Setor com mais pessoas é o 2");
        } else if (cont3 > cont2 && cont3 > cont && cont3 > cont4) {
            System.out.println("Setor com mais pessoas é o 3");
        } else {
            System.out.println("Setor com mais pessoas é o 4");
        }

        System.out.println("Pessoa Mais nova: " + nomenew + "    Pessoa mais velha: " + nomeold);
        System.out.println("Quantidade de pessoas foram admitidos em 2010 e trabalham na Administração: " + cont5);
        System.out.println("quantidade de funcionário setor 1: " + cont + " setor 2:" + cont2 + "  Setor 3: " + cont3
                + "  Setor 4: " + cont4);

        teclado.close();
    }
}
