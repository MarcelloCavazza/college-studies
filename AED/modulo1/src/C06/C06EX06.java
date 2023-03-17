package C06;

import java.util.Scanner;

public class C06EX06 {
    public static void main(String[] args) {
        int a, b, c;
        double delta;
        String mensagemFinal;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira o valor A: ");
        a = teclado.nextInt();
        System.out.print("Insira o valor b: ");
        b = teclado.nextInt();
        System.out.print("Insira o valor c: ");
        c = teclado.nextInt();

        delta = Math.pow(b, 2) - 4*a*c;
        if(delta == 0){
            double fx;
            fx = -b / (2*a);
            mensagemFinal = "Teremos 1 raiz: "+fx;
        }else if(delta < 0){
            mensagemFinal = "Nao existe raiz";
        }else{
            double xNegativo, xPositivo, fxPositivo, fxNegativo;
            xNegativo = -b - Math.sqrt(delta);
            xPositivo = -b + Math.sqrt(delta);

            fxPositivo = xPositivo / (2*a);
            fxNegativo = xNegativo / (2*a);
            mensagemFinal = "Teremos 2 raiz: "+fxPositivo+" e "+fxNegativo;
        }

        System.out.println(mensagemFinal);

        teclado.close();
    }
}
