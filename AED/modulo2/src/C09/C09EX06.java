package C09;

import java.util.Scanner;

public class C09EX06 {
    public static void main(String[] args) {
        double result = 0, den, num;

        for (int i = 1; i <= 20; i++) {
            den = Math.sqrt(i * 2);
            num = i;
            result += num / den;
        }
        System.out.println(10 + (result));
    }
}
