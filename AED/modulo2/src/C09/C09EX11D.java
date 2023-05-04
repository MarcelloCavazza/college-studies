package C09;

public class C09EX11D {
    public static void main(String[] args) {
        double num, div, soma = 0;
        for (int aux = 1; aux <= 100; aux++) {

            num = Math.pow(aux, 3);
            div = Math.pow(10, aux - 1);

            soma += num / div;
        }
        System.out.println(soma);
    }
}
