package C05;

import java.util.Scanner;

public class C05EX05 {
    // Autor: Marcello Henrique Cavazza Oliveira
    public static void main(String[] args) {
        double celsius, fahrenheit, kelvin;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira a temperatura em celcius: ");
        celsius = teclado.nextDouble();

        fahrenheit = celsius * 1.8 + 32;
        kelvin = celsius + 273;

        System.out.println(celsius+" Graus Celsius é equivalente a:\n"+
                fahrenheit+" Fahrenheit\n"+
                kelvin+" Kelvin");
        teclado.close();
    }
}
