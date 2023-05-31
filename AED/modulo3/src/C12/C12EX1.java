import java.util.ArrayList;
import java.util.Scanner;

public class C12EX1 {
    public static void main(String[] args) {
        ArrayList<Integer> valoresDivisiveis = new ArrayList<Integer>();
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Insira um numero: ");
            int valorTemporario = teclado.nextInt();
            if(valorTemporario % 5 == 0 && valorTemporario % 7 ==0)
                valoresDivisiveis.add(valorTemporario);
        }
        System.out.println("Numero diviseis por 7 e 5: ");
        for (int i = 0; i < valoresDivisiveis.size(); i++) {
            System.out.println(valoresDivisiveis.get(i));
        }
        teclado.close();
    }
}