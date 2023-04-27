package C08;

public class C08EX19 {
    public static void main(String[] args) {
        int total = 0;
        double quadrado = 0;
        for (int i = 1; i <= 100; i++) {
            quadrado = Math.pow(i, 2);
            total += quadrado;
        }
        System.out.println(total);
    }
}
