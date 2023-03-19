package C06;

import java.util.Scanner;

public class C06EX11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String mensagemFinal = "";
        System.out.print("Insira o nome da Equipe 1: ");
        String equipe1Nome = teclado.nextLine();
        System.out.print("Sets da Equipe 1: ");
        int equipe1SetsGanhos = teclado.nextInt();

        System.out.print("Insira o nome da Equipe 2: ");
        String equipe2Nome = teclado.nextLine();

        if(equipe1SetsGanhos == 0){
            mensagemFinal = "Equipe 1 = "+equipe1Nome+
                    "\nSets da equipe 1 = "+equipe1SetsGanhos+
                    "\nPontos "+equipe1Nome+" = "+equipe1SetsGanhos+
                    "\nEquipe 2 = "+equipe2Nome+
                    "\nSets da equipe 2 = 3"+
                    "\nPontos "+equipe2Nome+" = 3";
        }else{
            System.out.print("Sets da Equipe 2: ");
            int equipe2SetsGanhos = teclado.nextInt();
            if()
        }

        System.out.println(mensagemFinal);


        teclado.close();
    }
}
