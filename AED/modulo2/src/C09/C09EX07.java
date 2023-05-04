package C09;

public class C09EX07 {
    public static void main(String[] args) {
        double result = 0, den, num;

        for (int i = 1; i <= 6; i++) {
            den = i * 6 + 1;
            num = (i * 2 - 2) + (i * 3);
            result += num / den;
        }
        System.out.println((result));
    }

}
