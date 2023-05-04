package C11;

import java.util.Scanner;

public class C11EX08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double horas, cont = 0, salário, valor, ex = 0, media = 0, horast = 0, salárioM = 0, somaS = 0, cont1 = 0,
                cont2 = 0, cont3 = 0;
        String nome, cargo, nomeM = "", cargoM = "";

        do {
            cont++;
            System.out.print("Digite o nome: ");
            nome = teclado.nextLine();
            if (!nome.equalsIgnoreCase("X")) {
                System.out.print("Digite as horas trabalhadas: ");
                horas = teclado.nextDouble();
                System.out.print("Digite o valor da hora");
                valor = teclado.nextDouble();
                teclado.nextLine();
                System.out.print("Digite o cargo");
                cargo = teclado.nextLine();

                horast += horas;

                if (horas < 100) {
                    salário = (horas * valor) + 1000;
                    cont1++;
                } else if (horas < 500) {
                    salário = (horas * valor) + (horas * 10);
                    cont2++;
                } else {
                    if (horas > 10) {
                        horas -= 10;
                        ex += 100;
                    }
                    cont3++;
                    salário = (horas * valor) + ex;
                }

                somaS += salário;

                System.out.println("Nome: " + nome + " Salário: " + salário);

                if (cont == 0 || salário > salárioM) {
                    salárioM = salário;
                    nomeM = nome;
                    cargoM = cargo;
                }
            }
        } while (!nome.equalsIgnoreCase("X"));

        media = horast / cont;

        System.out.println("Media horas: " + media);
        System.out.println(
                "Nome da pessoas com o maior Sálario: " + nomeM + " Sálario: " + salárioM + " Cargo:" + cargoM);
        System.out.println("Premiação 1: " + cont1 + " Premiação 2: " + cont2 + "  Premiação 3: " + cont3);
        System.out.println("Folha total: " + somaS);

        teclado.close();
    }
}
