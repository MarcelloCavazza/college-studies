package C05;

import java.util.Scanner;

public class extra_C05EX01 {
    public static void main(String[] args) {
        int numeroDoUsuario;
        String numeroFeitoPeloSistema;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira um numero: ");
        numeroDoUsuario = teclado.nextInt();
        numeroFeitoPeloSistema = "" + numeroDoUsuario % 10+""+numeroDoUsuario%100/10+""+numeroDoUsuario%1000/100+""+numeroDoUsuario%10000/1000;

        if(numeroDoUsuario == Integer.parseInt(numeroFeitoPeloSistema)){
            System.out.print("Eh um palindramo");
        }else{
            System.out.print("Nao eh um palindramo");
        }

        teclado.close();
    }
}
