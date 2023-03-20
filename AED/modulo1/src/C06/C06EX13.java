package C06;

import java.util.Scanner;

public class C06EX13 {    // Autor: Marcello Henrique Cavazza Oliveira

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira o hoário de inicio do jogo, no modelo HH:YY: ");
        String horarioInicio = teclado.nextLine();
        System.out.print("Insira o hoário de fim do jogo, no modelo HH:YY: ");
        String horarioFim = teclado.nextLine();

        String [] horarioInicioDividido = horarioInicio.split(":");
        String [] horarioFimDividido = horarioFim.split(":");

        int horasInicio = Integer.valueOf(horarioInicioDividido[0]);
        int minutosInicio = Integer.valueOf(horarioInicioDividido[1]);

        int horasFim = Integer.valueOf(horarioFimDividido[0]);
        int minutosFim = Integer.valueOf(horarioFimDividido[1]);

        int minutosDiff = minutosFim - minutosInicio;
        int horasDiff = horasFim - horasInicio;

        if(minutosDiff < 0){
            minutosDiff = 60 + minutosDiff;
            if(horasDiff > 0) {
                horasDiff--;
            }
        }else{
            minutosDiff = 60 - minutosDiff;
        }

        System.out.println(horasDiff+"h:"+minutosDiff+"min");



        teclado.close();
    }
}
