package C05;

import java.util.Scanner;

public class C05EX05 {
    // Autor: Marcello Henrique Cavazza Oliveira
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira a temperatura em celcius: ");
        double celsius = teclado.nextDouble();

        double fahrenheit = celsius * 1.8 + 32;
        double kelvin = celsius + 273;

        System.out.println(celsius+" Graus Celsius é equivalente a:\n"+
                fahrenheit+" Fahrenheit\n"+
                kelvin+" Kelvin");
        teclado.close();
    }
}
