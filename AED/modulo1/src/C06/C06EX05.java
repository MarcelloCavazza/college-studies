package C06;

import java.util.Scanner;

public class C06EX05 {
    public static void main(String[] args) {
        int numeroEscolhidoPeloUsuario;
        String mensagemFinal;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira um numero: ");
        numeroEscolhidoPeloUsuario = teclado.nextInt();

        if(numeroEscolhidoPeloUsuario % 5 == 0 && numeroEscolhidoPeloUsuario % 7 == 0){
            mensagemFinal = numeroEscolhidoPeloUsuario+" eh divisivel simultaneamente por 5 e 7";
        }else{
            mensagemFinal = numeroEscolhidoPeloUsuario+" nao eh divisivel simultaneamente por 5 e 7";
        }
        System.out.println(mensagemFinal);
        teclado.close();
    }
}
