import java.util.Scanner;

public class C12EX2 {
	public static void main(String[] args){
		int[] valoresInseridos = new int[10];
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < valoresInseridos.length; i++) {
			System.out.print("Insira um numero: ");
			int tempNum = teclado.nextInt();
			if(tempNum > 5 && tempNum < 10){
				System.out.println(tempNum);
			}
		}
		teclado.close();
	}
}
