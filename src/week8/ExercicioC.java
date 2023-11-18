package week8;

import java.util.Scanner;

public class ExercicioC {
    static final Scanner SCANNER = new Scanner(System.in);

    public static int[] obterArray(int n){
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = SCANNER.nextInt();
        }
        return array;
    }
    public static boolean alwaysAsc(int[] values){
        for (int i = 1; i < values.length; i++) {
            if(values[i-1] >= values[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = SCANNER.nextInt();
        int[] values = obterArray(n);
        System.out.printf("always ascending = %b%n", alwaysAsc(values));
    }
}
