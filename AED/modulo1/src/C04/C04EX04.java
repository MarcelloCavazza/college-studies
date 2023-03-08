package C04;

import javax.swing.*;

public class C04EX04 {
    // Função: Pega seu nome completo e sua idade, mostrando um resumo no final via Dialog
    // Autor: Marcello Henrique Cavazza Oliveira
    public static void main(String[] args) {
        String primeiroNome, segundoNome, ultimoNome, title = "Dados do usuário";
        int idade;

        primeiroNome = JOptionPane.showInputDialog(null,"Insira seu primeiro nome:", title, JOptionPane.QUESTION_MESSAGE);
        segundoNome = JOptionPane.showInputDialog(null,"Insira seu nome do meio:", title, JOptionPane.QUESTION_MESSAGE);
        ultimoNome = JOptionPane.showInputDialog(null,"Insira seu ultimo nome:", title, JOptionPane.QUESTION_MESSAGE);
        idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira sua idade:", title, JOptionPane.QUESTION_MESSAGE));

        JOptionPane.showMessageDialog(null, ultimoNome+", "+ primeiroNome + " "+ segundoNome +
                "\nIdade: "+ idade + " anos", title, JOptionPane.INFORMATION_MESSAGE);
    }
}
