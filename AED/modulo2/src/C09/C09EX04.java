package C09;

import java.util.Scanner;

public class C09EX04 {
    public static void main(String[] args) {
        double result = 0;
        int rep = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira um valor: ");
        rep = teclado.nextInt();

        for (int i = 1; i <= rep; i++) {
            result += (i * 4.0 - 3) * (i * 4 - 2)/ (i * 4.0 - 1) * (i * 4.0);
        }
        System.out.println(Math.sqrt(result));
        teclado.close();
    }
    
}
