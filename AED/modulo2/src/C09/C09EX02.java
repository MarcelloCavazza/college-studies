package C09;

public class C09EX02 {
    public static void main(String[] args) {
        double  total = 0;
        for (int i = 1; i <= 100; i++) {
            total += i / (Math.pow(i, 2) + (i-1));
        }       
        System.out.println(total);
    }
    
}