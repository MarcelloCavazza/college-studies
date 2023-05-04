package C09;

public class C09EX10B {
    public static void main(String[] args) {
        double result = 0;
        for (int i = 1; i <= 100; i++) {
            result += (i * 2) / (i * 3);
        }
        System.out.println(1 + Math.sqrt(result));
    }
}
