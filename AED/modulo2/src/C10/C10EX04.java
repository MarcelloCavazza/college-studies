package C10;

import java.util.Scanner;

public class C10EX04 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double quantidade, valorbdi = 0, bdi, custoTotal = 0, preco, precofinal;
    String material;
    System.out.print("Qual a taxa BDI: ");
    bdi = teclado.nextDouble();
    do {
      teclado.nextLine();
      System.out.print("Nome do Material: ");
      material = teclado.nextLine();
      if (!material.equalsIgnoreCase("FIm")) {
        System.out.print("Preço: ");
        preco = teclado.nextDouble();

        System.out.print("Quantidade: ");
        quantidade = teclado.nextDouble();

        custoTotal += preco * quantidade;
      }

    } while (!material.equalsIgnoreCase("FIM"));

    valorbdi = custoTotal * (bdi / 100.0);
    precofinal = custoTotal + valorbdi;

    System.out.println("Preço Final: " + precofinal);
    teclado.close();

  }
}
