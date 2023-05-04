package C09;

public class C09EX10C {
    public static void main(String[] args) {
        double result = 0;

        for (int i = 1; i <= 100; i++) {
            result += (i * 2 - 1) / (i * 2);
        }

        System.out.println((1 / 3) * Math.pow(result, 2));
    }
}
