package C08;

import java.util.Scanner;

public class C08EX06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroInseridoPeloUsuario, somaDeNumerosDivisiveisPor4 = 0;
        byte quantidadeDeNumerosDivisiveisPor3 = 0;

        for (byte i = 0; i < 10; i++){
            System.out.print("Insira um numero inteiro: ");
            numeroInseridoPeloUsuario = input.nextInt();
            final boolean ehPar = numeroInseridoPeloUsuario % 2 == 0;
            if(ehPar){
                System.out.println("O numero "+numeroInseridoPeloUsuario+" eh par!");
            }else{
                System.out.println("O numero "+numeroInseridoPeloUsuario+" eh impar!");
            }

            final boolean ehDivisivelPor4 = numeroInseridoPeloUsuario % 4 == 0;
            if(ehDivisivelPor4){
                somaDeNumerosDivisiveisPor4 += numeroInseridoPeloUsuario;
            }
            final boolean ehDivisivelPor3 = numeroInseridoPeloUsuario % 3 == 0;
            if(ehDivisivelPor3){
                quantidadeDeNumerosDivisiveisPor3++;
            }
        }

        System.out.println("Soma dos numeros divisiveis por 4 = "+somaDeNumerosDivisiveisPor4);
        System.out.println("Quantidade de numeros divisiveis por 3 = "+quantidadeDeNumerosDivisiveisPor3);

        input.close();
    }
}
