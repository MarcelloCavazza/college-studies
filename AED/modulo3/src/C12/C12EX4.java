import java.util.Scanner;

public class C12EX4 {
	public static void main(String[] args){
		int[] corredores = new int[20];
		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < corredores.length; i++) {
			System.out.print("Insira o numero de um corredor: ");
			corredores[i] = teclado.nextInt();
		}

		


		teclado.close();
	}
}
