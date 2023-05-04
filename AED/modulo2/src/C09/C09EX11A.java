package C09;

public class C09EX11A {
    public static void main(String[] args) {
        double num, div, soma = 0;
        for (int aux = 1; aux <= 100; aux++) {

            num = aux + ((aux - 1) * 7 + 1);
            div = Math.pow(4, aux - 1);

            soma += num / div;
        }
        System.out.println(Math.cbrt(soma));
    }
}
