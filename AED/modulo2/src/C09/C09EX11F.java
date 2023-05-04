package C09;

public class C09EX11F {
    public static void main(String[] args) {
        double num, div, soma = 0;
        for (int aux = 1; aux <= 100; aux++) {

            num = (((aux - 1) * 2) + 1) * Math.pow(2, aux + 1);
            div = Math.pow(((aux - 1) * 5) + 2, 2);

            soma += num / div;
        }
        System.out.println(5 * Math.sqrt(soma));
    }
}
