package week7;

import java.util.Scanner;

public class ExercicioJ {
    static final Scanner SCANNER = new Scanner(System.in);
    public static int lerValor(int tamanho1, int tamanho2) {
        int n;
        do {
            n = SCANNER.nextInt();
        } while (!(tamanho1 <= n && n <= tamanho2));
        return n;
    }
    public static void main(String[] args) {
        int n = lerValor(1,100);
        int triplos=0;
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                for (int k = j; k > 0; k--) {
                    if(i + j + k == n){
                        System.out.printf("%d + %d + %d%n",i,j,k);
                        triplos++;
                    }
                }
            }
        }
        System.out.printf("triples=%d%n",triplos);
    }
}
