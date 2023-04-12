package C08;

import java.util.Scanner;

public class C08EX07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int idade, pessoasComAte12Anos = 0, pessoasComMaisDe30Anos = 0;
        double media = 0;
        for (int i = 0; i < 50; i++) {
            System.out.print("Insira seu nome: ");
            teclado.nextLine();
            if(i > 0){
                teclado.nextLine();
            }
            System.out.print("Insira sua idade: ");
            idade = teclado.nextInt();
            if(idade <=12){
                pessoasComAte12Anos++;
            }
            if(idade > 30){
                pessoasComMaisDe30Anos++;
            }
           media += idade; 
        }
        media = media / 50.0;
        System.out.println("Pessoas com ate 12 anos: "+pessoasComAte12Anos);
        System.out.println("Pessoas com mais de 30 anos: "+pessoasComMaisDe30Anos); 
        System.out.println("Media total das idades inseridas:"+media); 
        teclado.close();
    }
}
