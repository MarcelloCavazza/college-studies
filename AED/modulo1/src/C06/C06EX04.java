package C06;

import java.util.Scanner;

public class C06EX04 {
    // Autor: Marcello Henrique Cavazza Oliveira
    public static void main(String[] args) {
        String mensagemFinal;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira sua altura: ");
        double altura = teclado.nextDouble();

        System.out.print("Insira o seu peso: ");
        double peso = teclado.nextDouble();

        System.out.print("Insira seu nome: ");
        String nomeUsuario = teclado.next();

        double imc = peso / Math.pow(altura, 2);

        if(imc < 18){
            mensagemFinal = nomeUsuario + " esta desnutrido(a)";
        }else if(imc < 20){
            mensagemFinal =  nomeUsuario + " esta abaixo do peso";
        } else if (imc >= 20 && imc <= 25) {
            mensagemFinal = nomeUsuario + " esta no peso ideal";
        } else if (imc > 25 && imc <=27) {
            mensagemFinal = nomeUsuario + " esta acima do peso";
        } else{
            mensagemFinal = nomeUsuario + " esta obeso(a)";
        }
        System.out.println(mensagemFinal);
        teclado.close();

    }
}
