package C04;

import javax.swing.*;
import java.util.Scanner;

public class C04EX05 {
    // Função: Pega seus dados pessoais e nome de empresa de um arquivo, mostrando o resumo no Dialog
    // Autor: Marcello Henrique Cavazza Oliveira
    public static void main(String[] args) {
        String nomeDoUsuario, nomeDaEmpresa,
                cpf, identidade, tituloDeEleitor,
                carteiraDeMotorista, salario;

        Scanner arquivo = new Scanner(C04EX05.class.getResourceAsStream("ficha.txt"));
        JOptionPane.showMessageDialog(null, "Lendo dados do arquivo .txt ...", "Lendo arquivo", JOptionPane.INFORMATION_MESSAGE);
        nomeDoUsuario = arquivo.nextLine();
        cpf = arquivo.nextLine();
        identidade = arquivo.nextLine();
        tituloDeEleitor = arquivo.nextLine();
        carteiraDeMotorista = arquivo.nextLine();
        salario = arquivo.nextLine();
        nomeDaEmpresa = arquivo.nextLine();
        JOptionPane.showMessageDialog(null, "Ficha funcional de: "+ nomeDoUsuario+
                "\nDocumentos:"+
                "\nCPF:..................: "+cpf+
                "\nC.I...................: "+identidade+
                "\nTitulo de eleitor.....:"+tituloDeEleitor+
                "\nCarteira de mostorista:"+carteiraDeMotorista+
                "\n"+
                "\nEmpresa: "+nomeDaEmpresa+
                "\nSalario: R$"+salario, "Documentos do arquivo", JOptionPane.INFORMATION_MESSAGE);
        arquivo.close();
    }
}
