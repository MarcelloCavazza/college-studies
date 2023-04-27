package C08;
import javax.swing.JOptionPane;

public class C08EX11 {

    public static void main(String[] args) {
        
        int mulheresLoirasOlhosAzuis = 0;
        double maiorSalario = 0, menorSalario = 0, diferencaSalario = 0;
        String nomeMaiorSalario = "";
        boolean temHomem = false;

        for (int i = 0; i < 50; i++) {
            // leitura dos dados
            String nome = JOptionPane.showInputDialog("Informe o nome:");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade:"));
            String sexo = JOptionPane.showInputDialog("Informe o sexo (M/F):");
            String estadoCivil = JOptionPane.showInputDialog("Informe o estado civil (C/S/O):");
            String corOlhos = JOptionPane.showInputDialog("Informe a cor dos olhos (A/C/P/O):");
            String corCabelos = JOptionPane.showInputDialog("Informe a cor dos cabelos (L/P/C/R):");
            double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário:"));
            int escolaridade = Integer.parseInt(JOptionPane.showInputDialog("Informe a escolaridade (1-Analfabeto, 2-Ensino Fundamental, 3-Ensino Médio, 4-Superior):"));

            // verificação de mulheres loiras, de olhos azuis, com idade entre 18 e 25 anos, solteiras, salário maior que R$10.000,00 e curso superior completo
            if (sexo.equalsIgnoreCase("F") && corCabelos.equalsIgnoreCase("L") && corOlhos.equalsIgnoreCase("A")
                    && idade >= 18 && idade <= 25 && estadoCivil.equalsIgnoreCase("S") && salario > 10000
                    && escolaridade == 4) {
                mulheresLoirasOlhosAzuis++;
            }

            // verificação do maior salário e do nome da pessoa correspondente
            if (salario > maiorSalario) {
                maiorSalario = salario;
                nomeMaiorSalario = nome;
            }

            // verificação do menor salário entre os homens
            if (sexo.equalsIgnoreCase("M")) {
                if (!temHomem) {
                    menorSalario = salario;
                    temHomem = true;
                } else {
                    if (salario < menorSalario) {
                        menorSalario = salario;
                    }
                }
            }
        }

        // cálculo da diferença entre o maior e o menor salário dos homens
        diferencaSalario = maiorSalario - menorSalario;

        // impressão dos resultados
        JOptionPane.showMessageDialog(null,
                "Quantidade de mulheres loiras, de olhos azuis, com idade entre 18 e 25 anos, solteiras, salário maior que R$10.000,00 e curso superior completo: "
                        + mulheresLoirasOlhosAzuis + "\n" + "Nome da pessoa com maior salário: " + nomeMaiorSalario + "\n"
                        + "Diferença entre o maior e menor salário dos homens: " + diferencaSalario);
    }
}
