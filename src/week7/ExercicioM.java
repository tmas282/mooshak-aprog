package week7;

import java.util.Scanner;

public class ExercicioM {
    static final Scanner SCANNER = new Scanner(System.in);
    public static boolean temSoDigUnicos(int n){
        if(n < 0){
            n *= -1;
        }
        for (int i = 0; i <= 9; i++) {
            int qnt=0, temp=n;
            while(temp>0){
                int alg = temp % 10;
                temp /=10;
                if(alg == i){
                    qnt++;
                }
            }
            if(qnt > 1){
                return false;
            }
        }
        return true;
    }
    public static float calMedia(int nume, int deno){
        if(deno!=0){
            return (float) nume/deno * 100f;
        }
        else{
            return (float) 0;
        }
    }
    public static void main(String[] args) {
        boolean continuar = true;
        int qntNums = 0;
        int qntNeg = 0;
        int qntPos = 0;
        int qntUnique = 0;
        while(continuar){
            int n = SCANNER.nextInt();
            if(n!=0){
                qntNums++;
                if(temSoDigUnicos(n)){
                    System.out.println(n);
                    qntUnique++;
                };
                if(n>0){
                    qntPos++;
                }
                if(n<0){
                    qntNeg++;
                }
            }
            else{
                continuar = false;
            }
        }
        if(qntNums>0){
            System.out.printf("negatives: %.2f%%%n", calMedia(qntNeg, qntNums));
            System.out.printf("positives: %.2f%%%n", calMedia(qntPos ,qntNums));
            System.out.printf("with unique digits: %.2f%%%n", calMedia(qntUnique, qntNums));
        }
    }
}
