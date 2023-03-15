package C06;

import java.util.Scanner;

public class C06EX03 {
    public static void main(String[] args) {
        final double salarioFixo = 240.0;
        double salarioFinal, comissao;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira a comissao do mes: ");
        comissao = teclado.nextDouble();

        if(comissao <= 1000.0){
            System.out.println("Salario final é R$"+salarioFixo);
        }else if (comissao > 1000.0 && comissao <= 10000.0){
            salarioFinal = salarioFixo + (comissao * 0.1);
            System.out.println("Salario final é R$"+salarioFinal);
        }else{
            salarioFinal = salarioFixo + 1000.0;
            System.out.println("Salario final é R$"+salarioFinal);
        }

        teclado.close();
    }
}
