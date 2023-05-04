package C08;

public class C08EX28 {
    public static void main(String[] args) {
        int numeroTriangular = 0, soma = 0, cont = 0, media = 0;
        for (int aux = 1; aux <= 1000; aux++) {
            if (numeroTriangular >= 990) {
                break;
            }

            numeroTriangular = aux * (aux + 1) * (aux + 2);
            soma += numeroTriangular;
            cont++;
            System.out.println("Numeros triangulares: " + numeroTriangular);
        }
        media = soma / cont;
        System.out.println("Media: " + media);
    }
}
