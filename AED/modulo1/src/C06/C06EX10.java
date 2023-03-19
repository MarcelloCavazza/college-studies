package C06;

import java.util.Scanner;

public class C06EX10 {
    // Autor: Marcello Henrique Cavazza Oliveira
    public static void main(String[] args) {
        final double taxaDeAdministracao = 10.0;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira o capital aplicado: ");
        double capitalAplicado = teclado.nextInt();

        System.out.print("Insira o número de dias que ficará aplicado o valor: ");
        int diasAplicado = teclado.nextInt();

        System.out.print("Insira a taxa de juros diária: ");
        double taxaDiaria = teclado.nextDouble();

        double rendimento = capitalAplicado * taxaDiaria * diasAplicado,
            impostoDeRenda = rendimento  * 0.15,
            valorResgatado = capitalAplicado + rendimento - impostoDeRenda - taxaDeAdministracao;

        System.out.println("Detalhes da aplicacao:\n"+
                "- Rendimento: "+ String.format("%.2f", rendimento)+"\n"+
                "- Imposto de renda: "+impostoDeRenda+"\n"+
                "- Valor resgatado: "+String.format("%.2f", valorResgatado));

        teclado.close();
    }
}
