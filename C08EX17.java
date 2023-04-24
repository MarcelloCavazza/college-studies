package C08;

public class C08EX17 {
    public static void main(String[] args) {
        for (int i = 3; i < 12; i++) {
            System.out.println(String.format("%.4f",f(i)));
        }
    }
    public static double f(int x){
        return Math.sqrt(Math.pow(x,2) - 3);
    }
}
