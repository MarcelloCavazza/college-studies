package C06;

import java.util.Locale;
import java.util.Scanner;

public class C06EX15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira o codigo do seu pacote: ");
        int codigoDoPacote = teclado.nextInt();

        if(codigoDoPacote >= 1 && codigoDoPacote <= 3){
            System.out.print("Insira a quantidade de dias que utilizou Pay-per-view: ");
            int diasDePPV = teclado.nextInt();

            System.out.print("Insira o valor dos serviços extras: ");
            double valorPorServicosExtras = teclado.nextDouble();

            teclado.nextLine();

            System.out.print("Insira a sua cidade: ");
            String cidadeDoUsuario = teclado.nextLine();

            double valorFixo;
            double pppValorDiario;
            if(codigoDoPacote == 1){
                valorFixo = 65.00;
                pppValorDiario = 1.20;
            }else if(codigoDoPacote == 2){
                valorFixo = 104.00;
                pppValorDiario = 2.10;
            }else{
                valorFixo = 137.00;
                pppValorDiario = 0;
            }

            double imposto;
            if(cidadeDoUsuario.toLowerCase().equals("belo horizonte")){
                imposto = 0;
            } else if (cidadeDoUsuario.toLowerCase().equals("são paulo")){
                imposto = 0.01;
            }else if(cidadeDoUsuario.toLowerCase().equals("rio de janeiro")){
                imposto = 0.15;
            }else{
                imposto = 0.02;
            }

            double pppValorFinal =pppValorDiario * diasDePPV;
            if(cidadeDoUsuario.toLowerCase().equals("belo horizonte") && pppValorFinal > 65.00){
                pppValorFinal = 65.00;
            }

            double impostoValorFinal = (valorFixo + pppValorFinal + valorPorServicosExtras) * imposto;

            double contaFinal = valorFixo + pppValorFinal + valorPorServicosExtras + impostoValorFinal;
            System.out.println(String.format("%.2f",contaFinal));
        }else{
            System.out.println("Codigo de pacote inexistente");
        }



        teclado.close();
    }
}
