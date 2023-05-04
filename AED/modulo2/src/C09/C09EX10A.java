package C09;

public class C09EX10A {
    public static void main(String[] args) {
        double result = 0;
        for (int i = 1; i <= 100; i++) {
            result += i / Math.sqrt(i * 2);
        }
        System.out.println(result);
    }
}
