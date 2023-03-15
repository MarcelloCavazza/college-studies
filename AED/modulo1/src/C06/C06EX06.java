package C06;

import java.util.Scanner;

public class C06EX06 {
    public static void main(String[] args) {
        int a, b, c;
        double delta, fx, fxNegativo,xNegativo, xPositivo, fxPositivo;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira o valor A: ");
        a = teclado.nextInt();
        System.out.print("Insira o valor b: ");
        b = teclado.nextInt();
        System.out.print("Insira o valor c: ");
        c = teclado.nextInt();

        delta = Math.pow(b, 2) - 4*a*c;
        if(delta == 0){
            fx = -b - Math.sqrt(delta);
            System.out.println("Teremos 1 raiz: "+fx);
        }else if(delta < 0){
            System.out.println("Nao existe raiz");
        }else{
            xNegativo = -b - Math.sqrt(delta);
            
            fxPositivo = -b + Math.sqrt(delta);
            System.out.println("Teremos 2 raiz: "+fxPositivo+" e "+fxNegativo);
        }

        teclado.close();
    }
}
