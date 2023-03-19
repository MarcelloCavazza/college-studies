package C04;

import java.util.Scanner;

public class C04EX02 {
    // Autor: Marcello Henrique Cavazza Oliveira
    public static void main(String[] args) {
        String nomeDoUsuario, nomeDaEmpresa,
                cpf, identidade, tituloDeEleitor,
                carteiraDeMotorista,salario;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira o seu nome:");
        nomeDoUsuario = teclado.next();

        System.out.print("Insira o nome da empresa:");
        nomeDaEmpresa = teclado.next();

        System.out.print("Insira o seu cpf:");
        cpf = teclado.next();

        System.out.print("Insira o seu Num de indentidade:");
        identidade = teclado.next();

        System.out.print("Insira o seu Num de titulo de eleitor:");
        tituloDeEleitor = teclado.next();

        System.out.print("Insira o seu Num de cateira de motorista:");
        carteiraDeMotorista = teclado.next();

        System.out.print("Insira o seu salario:");
        salario = teclado.next();
        
        System.out.println("Ficha funcional de: "+ nomeDoUsuario+
                "\nDocumentos:"+
                "\nCPF:..................: "+cpf+
                "\nC.I...................: "+identidade+
                "\nTitulo de eleitor.....:"+tituloDeEleitor+
                "\nCarteira de mostorista:"+carteiraDeMotorista+
                "\n"+
                "\nEmpresa: "+nomeDaEmpresa+
                "\nSalario: R$"+salario);

        teclado.close();
    }
}
