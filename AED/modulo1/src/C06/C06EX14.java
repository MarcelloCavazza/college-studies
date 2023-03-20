package C06;

import java.util.Scanner;

public class C06EX14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira um número de 4 digitos: ");
        int numeroDoUsuario = teclado.nextInt();
        if(numeroDoUsuario < 999){
            System.out.print("Nao eh permitido numeros com menos de 4 digitos inteiros.");
        }else{
            System.out.print("Impressao: "+numeroDoUsuario % 10+
                    numeroDoUsuario % 100 / 10+
                    numeroDoUsuario % 1000 / 100+
                    numeroDoUsuario / 1000);
        }

        teclado.close();
    }
}
