package C09;

public class C09EX10E {
    public static void main(String[] args) {
        double num, div, soma = 0;
        for (int aux = 1; aux <= 100; aux++) {

            num = aux;
            div = 3 * (aux * 2);

            soma += num / div;
        }
        System.out.println(soma);
    }
}
