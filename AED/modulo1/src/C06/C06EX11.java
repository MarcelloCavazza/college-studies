package C06;

import java.util.Scanner;

public class C06EX11 {
    // Autor: Marcello Henrique Cavazza Oliveira
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String mensagemFinal = "";
        System.out.print("Insira o nome da Equipe 1: ");
        String equipe1Nome = teclado.nextLine();
        System.out.print("Sets da Equipe 1: ");
        int equipe1SetsGanhos = teclado.nextInt();

        teclado.nextLine();

        System.out.print("Insira o nome da Equipe 2: ");
        String equipe2Nome = teclado.nextLine();
        System.out.print("Sets da Equipe 2: ");
        int equipe2SetsGanhos = teclado.nextInt();

        if (equipe1SetsGanhos == 0) {
            mensagemFinal = "Resultado:\n" +
                    "Equipe 1 = " + equipe1Nome +
                    "\nSets da equipe 1 = 0" +
                    "\nPontos " + equipe1Nome + " = 0" +
                    "\nEquipe 2 = " + equipe2Nome +
                    "\nSets da equipe 2 = 3" +
                    "\nPontos " + equipe2Nome + " = 3";
        } else if (equipe2SetsGanhos == 0) {
            mensagemFinal = "Resultado:\n" +
                    "Equipe 1 = " + equipe1Nome +
                    "\nSets da equipe 1 = 3" +
                    "\nPontos " + equipe1Nome + " = 3" +
                    "\nEquipe 2 = " + equipe2Nome +
                    "\nSets da equipe 2 = 0" +
                    "\nPontos " + equipe2Nome + " = 0";
        } else {
            if (equipe1SetsGanhos == 3 && equipe2SetsGanhos == 1) {
                mensagemFinal = "Resultado:\n" +
                        "Equipe 1 = " + equipe1Nome +
                        "\nSets da equipe 1 = 3" +
                        "\nPontos " + equipe1Nome + " = 3" +
                        "\nEquipe 2 = " + equipe2Nome +
                        "\nSets da equipe 2 = 1" +
                        "\nPontos " + equipe2Nome + " = 0";
            } else if (equipe1SetsGanhos == 1 && equipe2SetsGanhos == 3) {
                mensagemFinal = "Resultado:\n" +
                        "Equipe 1 = " + equipe1Nome +
                        "\nSets da equipe 1 = 1" +
                        "\nPontos " + equipe1Nome + " = 0" +
                        "\nEquipe 2 = " + equipe2Nome +
                        "\nSets da equipe 2 = 3" +
                        "\nPontos " + equipe2Nome + " = 3";
            } else {
                if (equipe1SetsGanhos == 3 && equipe2SetsGanhos == 2) {
                    mensagemFinal = "Resultado:\n" +
                            "Equipe 1 = " + equipe1Nome +
                            "\nSets da equipe 1 = 3" +
                            "\nPontos " + equipe1Nome + " = 3" +
                            "\nEquipe 2 = " + equipe2Nome +
                            "\nSets da equipe 2 = 2" +
                            "\nPontos " + equipe2Nome + " = 1";
                } else if (equipe1SetsGanhos == 2 && equipe2SetsGanhos == 3) {
                    mensagemFinal = "Resultado:\n" +
                            "Equipe 1 = " + equipe1Nome +
                            "\nSets da equipe 1 = 2" +
                            "\nPontos " + equipe1Nome + " = 1" +
                            "\nEquipe 2 = " + equipe2Nome +
                            "\nSets da equipe 2 = 3" +
                            "\nPontos " + equipe2Nome + " = 3";
                }
            }


        }
        System.out.println(mensagemFinal);

        teclado.close();
    }
}
