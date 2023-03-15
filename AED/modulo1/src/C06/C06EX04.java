package C06;

import java.util.Scanner;

public class C06EX04 {
    public static void main(String[] args) {
        String nomeUsuario;
        double peso, altura, imc;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira sua altura: ");
        altura = teclado.nextDouble();

        System.out.print("Insira o seu peso: ");
        peso = teclado.nextDouble();

        System.out.print("Insira seu nome: ");
        nomeUsuario = teclado.next();

        imc = peso / Math.pow(altura, 2);

        if(imc < 18){
            System.out.println(nomeUsuario + " esta desnutrido(a)");
        }else if(imc < 20){
            System.out.println(nomeUsuario + " esta abaixo do peso");
        } else if (imc >= 20 && imc <= 25) {
            System.out.println(nomeUsuario + " esta no peso ideal");
        } else if (imc > 25) {
            System.out.println(nomeUsuario + " esta acima do peso");
        } else if (imc > 27) {
            System.out.println(nomeUsuario + "esta obeso(a)");
        }

        teclado.close();

    }
}
