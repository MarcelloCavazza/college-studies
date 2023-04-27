package C08;

import java.util.Scanner;

public class C08EX05 {
    public static void main(String[] args) {
        Scanner telcado = new Scanner(System.in);
        byte numeroDoVoto, votosDoCondidato1 = 0, votosDoCondidato2 = 0, votosDoCondidato3 = 0;
        String resultado;
        boolean votoValidado = false;

        for (byte i = 0; i < 100; i++) {
            while (!votoValidado) {
                if (i > 0)
                    System.out.println("------------------------------"+
                            "\n**Proximo cidadao**");
                System.out.print("Selecione o numero referente ao seu candidato: " +
                        "\n1- Fulano" +
                        "\n2- Ciclano" +
                        "\n3- Beltrano"+
                        "\nInsira o numero do candidato: ");
                numeroDoVoto = telcado.nextByte();

                if (numeroDoVoto >= 1 || numeroDoVoto <= 3) {
                    votoValidado = true;
                    if (numeroDoVoto == 1) {
                        votosDoCondidato1 += numeroDoVoto;
                    } else if (numeroDoVoto == 2) {
                        votosDoCondidato2 += numeroDoVoto;
                    } else {
                        votosDoCondidato3 += numeroDoVoto;
                    }
                }
            }
            votoValidado = false;
        }
        if (votosDoCondidato1 > votosDoCondidato2 && votosDoCondidato1 > votosDoCondidato3) {
            resultado = "Ful";
        } else if (votosDoCondidato2 > votosDoCondidato1 && votosDoCondidato2 > votosDoCondidato3) {
            resultado = "Cicl";
        } else {
            resultado = "Beltr";
        }
        System.out.println("O candidato vencedor foi " + resultado + "ano!" +
                "\nQuantidade de votos para cada candidato:" +
                "\n-Fulano: " + votosDoCondidato1 +
                "\n-Ciclano: " + votosDoCondidato2 +
                "\n-Beltrano: " + votosDoCondidato3);
        telcado.close();
    }
}
