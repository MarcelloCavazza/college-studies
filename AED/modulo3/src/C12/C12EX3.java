import java.util.Scanner;

public class C12EX3 {
	public static void main(String[] args){
		int[] numeros = new int[10];
		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Insira um numero: ");
			numeros[i] = teclado.nextInt();
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(Math.pow(numeros[i], 2));
		}

		teclado.close();
	}
}
