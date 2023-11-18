package week8;

import java.util.Scanner;

public class ExercicioD {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        int n = SCANNER.nextInt();
        int[] qnt = new int[21];
        for (int i = 0; i < n; i++) {
            int temp = SCANNER.nextInt();
            qnt[temp] += 1;
        }
        for (int i = 0; i < qnt.length; i++) {
            System.out.printf("%d %d%n", i, qnt[i]);
        }
    }
}
