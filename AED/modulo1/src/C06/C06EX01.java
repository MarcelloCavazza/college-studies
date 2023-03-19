package C06;

import java.util.Scanner;

public class C06EX01 {
    // Autor: Marcello Henrique Cavazza Oliveira
    public static void main(String[] args) {
        float x, fx;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira o valor de X: ");
        x = teclado.nextFloat();

        if(x == 4){
            fx = 0;
        }else if(x>4){
            fx = (float) ((5*x+3)/Math.sqrt(Math.pow(x,2) -16));
        }else{
            fx = (float) ((5*x+3)/Math.sqrt(16 - Math.pow(x,2)));
        }

        System.out.println("f("+x+") = "+fx);

        teclado.close();
    }
}
