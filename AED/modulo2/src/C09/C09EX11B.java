package C09;

public class C09EX11B {
    public static void main(String[] args) {
        double num, div, soma = 0;
        for (int aux = 1; aux <= 100; aux++) {

            num = ((aux - 1) * 3 + 1);
            div = Math.sqrt(aux * 3 + 4);

            soma += num / div;
        }
        System.out.println((5.0 / 3.0) * soma);
    }
}
