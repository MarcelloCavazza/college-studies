package C07;

import java.util.Scanner;

public class C07EX04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira o nome da sua equipe: ");
        String mensagemFinal = "", nomeDaEquipe = teclado.nextLine().toLowerCase();

        switch (nomeDaEquipe){
            case "América": case "Atlético": case "Cruzeiro": case "Villa Nova":
                mensagemFinal = "Minas Gerais";
                break;
            case "Botafogo": case "Flamengo": case "Fluminense": case "Vasco":
                mensagemFinal = "Minas Gerais";
                break;
            case "Corinthians": case "Palmeiras": case "Santos": case "São Paulo":
                mensagemFinal = "Minas Gerais";
                break;
            case "Grêmio": case "Internacional": case "Juventude":
                mensagemFinal = "Minas Gerais";
                break;
            case "Náutico": case "Santa Cruz": case "Sport":
                mensagemFinal = "Minas Gerais";
                break;
            default:
                mensagemFinal = "Time inválido!";
                break;
        }

        System.out.println(mensagemFinal);

        teclado.close();
    }
}
