package C09;

public class C09EX11C {
    public static void main(String[] args) {
        double num, div, soma = 0;
        for (int aux = 1; aux <= 100; aux++) {

            num = ((aux * 2) + 1) * Math.sqrt((aux * 4) + 1);
            div = Math.pow(5, aux);

            soma += num / div;
        }
        System.out.println(Math.pow(soma, 2));
    }
}
