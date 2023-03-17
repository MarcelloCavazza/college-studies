package C06;

import java.util.Scanner;

public class C06EX09 {
    public static void main(String[] args) {
        char genero;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a letra do seu genero:"+
                "\n   'F' para feminino;"+
                "\n   'M' para masculino;");
        genero = teclado.next().charAt(0);
        if(String.valueOf(genero) == ""){

        }
    }
}
