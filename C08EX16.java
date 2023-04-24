package C08;

public class C08EX16 {
    public static void main(String[] args) {
        int limite = 2000, acumulador = 0, qtdImpares= 0;
        for (int i = 1000; i < limite; i++) {
            if(i % 2 == 0) continue;
            acumulador += i;
            qtdImpares++;
        }
        System.out.println(acumulador / qtdImpares);
    }
}
