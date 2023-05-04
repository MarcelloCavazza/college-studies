package C09;

public class C09EX11E {
    public static void main(String[] args) {
        double num, div, soma = 0;
        for (int aux = 1; aux <= 100; aux++) {

            num = Math.pow(aux, 2) * Math.sqrt(aux * 2 + 3);
            div = Math.pow(aux + 1, aux);

            soma += num / div;
        }
        System.out.println((2.0 / 3.0) * soma);
    }
}
