package C09;

public class C09EX10D {
    public static void main(String[] args) {
        double num, div, soma = 0;
        for (int aux = 1; aux <= 100; aux++) {

            num = aux + (aux - 1);
            div = Math.pow(aux, 2);

            soma += num / div;
        }
        System.out.println(soma);
    }
}
