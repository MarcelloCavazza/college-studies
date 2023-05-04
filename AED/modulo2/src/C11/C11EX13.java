package C11;

public class C11EX13 {
    public static void main(String[] args) {
        double cont = 0, den = 0, num = 0, serie = 0, soma = 0;
        do {
            cont++;
            num = (cont) * (Math.pow(((cont - 1) * 9) + 10, (cont * 2)));
            den = Math.pow(7, cont - 1);
            soma += num / den;
        } while (cont <= 20);
        serie = 71 + Math.cbrt(soma);
        System.out.println(serie);
    }
}
