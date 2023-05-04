package C09;

public class C09EX10F {
    public static void main(String[] args) {
        double num, div, soma = 0;
        for (int aux = 1; aux <= 100; aux++) {

            num = Math.pow(aux, 2);
            div = Math.pow(aux * 2, 2);

            soma += num / div;
        }
        System.out.println(soma);
    }
}
