package C09;

import java.util.Scanner;

public class C09EX03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int reps = 0;
        System.out.print("Insira um valor: ");
        reps = teclado.nextInt();
        double result = 0;
        for (int i = 1; i <= reps; i++) {
            result += (1 + Math.sqrt(i*4)) / (i * 3.0);
        }
        System.out.println(result);
        teclado.close();
    }
    
}
