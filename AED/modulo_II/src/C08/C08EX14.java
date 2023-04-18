package C08;

import java.util.Scanner;

public class C08EX14 {
    public static void main(String[] args) {
        int numeroDoUsuario = 0;
        boolean usuarioInseriuCorretamente = false;
        Scanner teclado = new Scanner(System.in);


        while (!usuarioInseriuCorretamente){
            System.out.print("Insira um valor entre 1 e 20:");
            numeroDoUsuario = teclado.nextInt();
            if(numeroDoUsuario >= 1 && numeroDoUsuario <= 20){
                usuarioInseriuCorretamente = true;
            }else {
                System.out.println("Insira um numero correto!");
            }
        }
        for (int aux = 0; aux < numeroDoUsuario; aux++){
            for (int auj = 0; auj < numeroDoUsuario; auj++) {
                System.out.print("*");
            }
            System.out.println("");
        }


        teclado.close();
    }
}
