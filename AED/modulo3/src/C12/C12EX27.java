import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C12EX27 {
	public static void main(String[] args) {
		List<String> listCPF = new ArrayList<String>();
		List<String> listENDERECO = new ArrayList<String>();
		boolean continueLoop = true;
		Scanner teclado = new Scanner(System.in);
		byte firstLoop = 0;
		do {
			if (firstLoop != 0) {
				boolean respostaCorreta = false;
				while (!respostaCorreta) {
					System.out.print("Deseja sair? (S/N)");
					String escolha = teclado.nextLine();
					if (escolha.length() == 1) {
						switch (escolha.toLowerCase()) {
							case "s":
								continueLoop = false;
								firstLoop = 0;
								break;
							case "n":
								break;
							default:
								System.out.println("Escolha uma opcao correta");
								break;

						}
					} else {
						System.out.println("Escolha uma opcao correta");
					}
				}

			} else {
				firstLoop++;
				System.out.print("Insira um CPF: ");
				listCPF.add(teclado.nextLine());
				System.out.print("Insira um endereco: ");
				listENDERECO.add(teclado.nextLine());
			}
		} while (continueLoop);

		firstLoop = 0;
		continueLoop = true;

		do {
			if (firstLoop != 0) {
				boolean respostaCorreta = false;
				while (!respostaCorreta) {
					System.out.print("Deseja sair? (S/N)");
					String escolha = teclado.nextLine();
					if (escolha.length() == 1) {
						switch (escolha.toLowerCase()) {
							case "s":
								continueLoop = false;
								firstLoop = 0;
								break;
							case "n":
								break;
							default:
								System.out.println("Escolha uma opcao correta");
								break;

						}
					} else {
						System.out.println("Escolha uma opcao correta");
					}
				}
			} else {
				System.out.print("Insira um CPF para pesquisar: ");
				String cpfProcurado = teclado.nextLine();
				int indexOfCPF = listCPF.indexOf(cpfProcurado);
				if (indexOfCPF != -1) {
					boolean respostaCorreta = false;
					while (!respostaCorreta) {
						System.out.print("Desejar Alterar ou Excluir? (A/E)");
						String resposta = teclado.nextLine();
						if (resposta.length() == 1) {
							switch (resposta.toLowerCase()) {
								case "a":
									System.out.print("Insira um novo endereco para substituir "
											+ listENDERECO.get(indexOfCPF) + " : ");
									listENDERECO.add(indexOfCPF, teclado.nextLine());
									break;
								case "e":
									listCPF.remove(indexOfCPF);
									listENDERECO.remove(indexOfCPF);
									break;
								default:
									break;
							}
						} else {
							System.out.println("Escolha uma opcao correta");
						}
					}
				} else {
					boolean respostaCorreta = false;
					while(!respostaCorreta){
						System.out.print("Nao existe esse CPF\nDeseja inserir esse novo CPF? (S/N)");
						String resposta = teclado.nextLine();
						if(resposta.length() != 1){
							System.out.println("Escolha uma opcao correta");
						}else{
							switch(resposta.toLowerCase()){
								case "s":
									listCPF.add(cpfProcurado);
									
									break;
								case "n":
									respostaCorreta = true;
									break;
							}
						}
					}

				}
				firstLoop++;
			}
		} while (continueLoop);
		teclado.close();
	}
}
