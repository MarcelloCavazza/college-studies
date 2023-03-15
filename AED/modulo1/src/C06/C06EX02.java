package C06;

import java.util.Scanner;

public class C06EX02 {
    public static void main(String[] args) {
        float quantidadeDePoluentesEmitidos;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quanto poluentes foram emitidos? ");
        quantidadeDePoluentesEmitidos = teclado.nextFloat();

        if(quantidadeDePoluentesEmitidos <= 1500){
            System.out.println("Voce esta isento de multa.");
        }else if(quantidadeDePoluentesEmitidos > 1500 && quantidadeDePoluentesEmitidos <= 3500){
            System.out.println("Voce deve pagar a multa de R$3.000,00.");
        }else{
            System.out.println("Voce deve pagar a multa de R$"+quantidadeDePoluentesEmitidos*5000.0);
        }

        teclado.close();
    }
}
