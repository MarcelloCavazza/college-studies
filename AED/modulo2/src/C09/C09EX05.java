package C09;

import java.util.Scanner;

public class C09EX05 {
    public static void main(String[] args) {
        double result = 0;
        int rep = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira um valor: ");
        rep = teclado.nextInt();
        double den, num;
        for (int i = 1; i <= rep; i++) {
            den = (i*6+1);
            num = (i * 2 -2 )+(i*3);
            result += num/den;
        }
        System.out.println(5*result);
        teclado.close();
    }
    
}
