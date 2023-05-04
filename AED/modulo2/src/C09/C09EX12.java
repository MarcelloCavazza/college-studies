package C09;

public class C09EX12 {
    public static void main(String[] args) {
        double num, div, soma = 0;
        for (int aux = 1; aux <= 10000; aux++) {

            num = 1;
            div = ((aux - 1) * 2) + 1;

            if (aux % 2 != 0) {
                soma += num / div;
            } else {
                soma -= num / div;
            }

        }
        System.out.println(4 * soma);
    }
}
