package C06;

import java.util.Scanner;

public class C06EX09 {
    // Autor: Marcello Henrique Cavazza Oliveira
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("'F' para feminino;\n"+
                "'M' para masculino\n"+
                "Digite a letra do seu genero:");
        char genero = teclado.next().charAt(0);
        if(genero == 'M' || genero == 'm' || genero == 'F' || genero == 'f'){
            double pesoIdeal = 0;
            System.out.print("Qual a sua altura?");
            double altura = teclado.nextDouble();
            if(genero == 'M' || genero == 'm'){
                pesoIdeal = 72.7 * altura - 58;
            }else if (genero == 'F' || genero == 'f'){
                pesoIdeal = 62.1 * altura - 44.7;
            }
            System.out.println("Peso do usuario: "+ String.format("%.3f",pesoIdeal));
        }else{
            System.out.println("Fechando programa...\n"+
                    "Somente selecione M ou F");
        }
    }
}
