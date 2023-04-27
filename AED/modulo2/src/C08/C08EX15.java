package C08;

import java.util.Scanner;

public class C08EX15 {
    public static void main(String[] args) {
        Scanner arquivo = new Scanner(C08EX15.class.getResourceAsStream("c08ex15.txt"));
        String nome = "", cargo ="", cargoComMaiorSalario = "", pessoaComMaiorSalario = "";
        int idade = 0, quantidadeDePessoasAte18 = 0;
        double salario=0, mediaSalarios18anos = 0.0, maiorSalario = Double.MIN_VALUE ,totalSalarios18anos = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                switch (j){
                    case 0:
                        nome = arquivo.nextLine();
                        break;
                    case 1:
                        cargo = arquivo.nextLine();
                        break;
                    case 2:
                        idade = Integer.parseInt(arquivo.nextLine());
                        break;
                    default:
                        salario = Double.parseDouble(arquivo.nextLine());
                        break;
                }
            }
            if(salario > maiorSalario){
                maiorSalario = salario;
                pessoaComMaiorSalario = nome;
                cargoComMaiorSalario = cargo;
            }
            if(idade <= 18){
                totalSalarios18anos += salario;
                quantidadeDePessoasAte18++;
            }
        }
        mediaSalarios18anos = totalSalarios18anos / quantidadeDePessoasAte18 / 1.0;
        System.out.println("Pessoa com maior salario: "+pessoaComMaiorSalario+" e seu cargo eh "+cargoComMaiorSalario);
        System.out.println("Media de salarios para pessoas com maior de 18 anos: "+String.format("%.2f",mediaSalarios18anos));
        arquivo.close();
    }
}
