package C06;

import java.util.Scanner;

public class C06EX05 {
    public static void main(String[] args) {
        int numeroEscolhidoPeloUsuario;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira um numero: ");
        numeroEscolhidoPeloUsuario = teclado.nextInt();

        if(numeroEscolhidoPeloUsuario % 5 == 0 && numeroEscolhidoPeloUsuario % 7 == 0){
            System.out.println(numeroEscolhidoPeloUsuario+" eh divisivel simultaneamente por 5 e 7");
        }else{
            System.out.println(numeroEscolhidoPeloUsuario+" nao eh divisivel simultaneamente por 5 e 7");
        }

        teclado.close();
    }
}
