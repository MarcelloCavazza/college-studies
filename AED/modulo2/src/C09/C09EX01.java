package C09;

import javax.naming.spi.DirStateFactory.Result;

public class C09EX01 {
    public static void main(String[] args) {
        double result = 0;
        for (int i = 1; i <= 37; i++) {

            result += (((i * -1) + 38) * ((i * -1) + 39)) / i;
        }
        System.out.println(result);
    }

}
