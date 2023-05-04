package C10;

import java.util.Scanner;

public class C10EX05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double altura, peso, cont = 0, cont2 = 0, cont3 = 0, cont4 = 0, alturaM = 0, alturaMedia;
        String sexo;
        do {
            System.out.print("Digite sua altura: ");
            altura = teclado.nextDouble();

            System.out.print("Digite seu peso: ");
            peso = teclado.nextDouble();

            teclado.nextLine();
            System.out.print("Digite o sexo: ");
            sexo = teclado.nextLine();

            cont++;

            if (sexo.equalsIgnoreCase("F")) {
                cont2++;
            } else {
                alturaM = altura;
                cont3++;
            }

            if (sexo.equalsIgnoreCase("F") && peso < 60) {
                cont4++;
            }
        } while (altura != 4);

        alturaMedia = alturaM / cont3;

        System.out.println(" Quantidade de pessoas pesquisadas; \n" + cont +
                " Quantidade de mulheres;\n" + cont2 +
                " Altura média dos homens;\n" + alturaMedia +
                " Quantidade de mulheres com peso menor que 60.\n" + cont4);

        teclado.close();
    }
}
