package week6;

import java.util.Scanner;

public class ExercicioD {
    static final Scanner SCANNER = new Scanner(System.in);
    static int factorial(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    static int combinations(int m, int n){
        return (factorial(m) / (factorial(n) * factorial(m-n)));
    }
    static int permutations(int m, int n){
        return (factorial(m) / factorial(m-n));
    }
    public static void main(String[] args) {
        int a = SCANNER.nextInt();
        int b = SCANNER.nextInt();
        if(a>=b){
            System.out.printf("C(%d,%d)=%d\n",a,b,combinations(a,b));
            System.out.printf("P(%d,%d)=%d\n",a,b,permutations(a,b));
        }
    }
}
