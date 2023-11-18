package week6;

import java.util.Scanner;

public class ExercicioG {
    final static Scanner SCANNER = new Scanner(System.in);
    public static boolean armstrong(int n){
        int temp=n, qntAlg=0, soma=0;
        while(temp>0){
            temp /=10;
            qntAlg++;
        }
        temp=n;
        while(temp>0){
            int alg = temp % 10;
            temp /=10;
            soma += Math.pow(alg, qntAlg);
        }
        if(soma==n){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n = SCANNER.nextInt();
        for (int i = 0; i <= n; i++) {
            boolean ver = armstrong(i);
            if(ver){
                System.out.println(i);
            }
        }
    }
}
