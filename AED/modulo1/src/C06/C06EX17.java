package C06;

import java.util.Scanner;

public class C06EX17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char escolhaAtual;
        boolean cursoTecnico = false,
                cursoSuperior = false,
                menos3AnosDeExp = false,
                pessoaCriativa = false,
                ehLider = false,
                prefereTrabalharSozinho = false,
                ehAutididata = false,
                aceita1500 = false,
                trabalharEmEscritoriosBh = false;
        System.out.println("SOMENTE RESPONDA COM V OU F");

        System.out.print("1- Você tem curso técnico de programação?");
        escolhaAtual = teclado.next().charAt(0);
        if(escolhaAtual == 'V' || escolhaAtual == 'v'){
                cursoTecnico = true;
        }

        System.out.print("2- Você tem curso superior de programação?");
        escolhaAtual = teclado.next().charAt(0);
        if(escolhaAtual == 'V' || escolhaAtual == 'v'){
                cursoSuperior = true;
        }

        System.out.print("3- Você tem menos de 3 anos de experiência em programação? ");
        escolhaAtual = teclado.next().charAt(0);
        if(escolhaAtual == 'V' || escolhaAtual == 'v'){
                menos3AnosDeExp = true;
        }
        System.out.print("4- Você se considera uma pessoa criativa?");
        escolhaAtual = teclado.next().charAt(0);
        if(escolhaAtual == 'V' || escolhaAtual == 'v'){
                pessoaCriativa = true;
        }
        System.out.print("5- Você prefere liderar a ser liderado?");
        escolhaAtual = teclado.next().charAt(0);
        if(escolhaAtual == 'V' || escolhaAtual == 'v'){
                ehLider = true;
        }
        System.out.print("6- Você prefere trabalhar sozinho a trabalhar em equipe?");
        escolhaAtual = teclado.next().charAt(0);
        if(escolhaAtual == 'V' || escolhaAtual == 'v'){
                prefereTrabalharSozinho = true;
        }
        System.out.print("7- Você é autodidata (aprende sozinho)?");
        escolhaAtual = teclado.next().charAt(0);
        if(escolhaAtual == 'V' || escolhaAtual == 'v'){
                ehAutididata = true;
        }
        System.out.print("8- Você aceitaria uma remuneração inicial de R$1500?");
        escolhaAtual = teclado.next().charAt(0);
        if(escolhaAtual == 'V' || escolhaAtual == 'v'){
                aceita1500 = true;
        }
        System.out.print("9- Você só aceitaria trabalhar em escritórios da empresa dentro da grande BH?");
        escolhaAtual = teclado.next().charAt(0);
        if(escolhaAtual == 'V' || escolhaAtual == 'v'){
                trabalharEmEscritoriosBh = true;
        }

       if(pessoaCriativa == true &&
               prefereTrabalharSozinho == false &&
               ehAutididata == true &&
               trabalharEmEscritoriosBh == false &&
               (ehLider == true && aceita1500 == false) &&
               ((cursoTecnico == true || cursoSuperior == true) && menos3AnosDeExp == false)){
           System.out.print("Voce eh apto a trabalhar aqui!");
       }else{
            System.out.print("Voce nao eh apto a trabalhar aqui!");
        }

        teclado.close();
    }
}
