package week6;

import java.util.Scanner;

public class ExercicioH {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static boolean palindrome(int n){
        int temp=n, numC=0, qntDig=0;
        while (temp>0){
            temp /= 10;
            qntDig++;
        }
        temp=n;
        while (temp>0){
            int alg = temp % 10;
            numC += (int) (alg * Math.pow(10, qntDig));
            qntDig--;
            temp /= 10;
        }
        numC /= 10;
        return numC==n;
    }
    public static void main(String[] args) {
        boolean enc = false;
        for(int i=0; i<5; i++){
            if(!enc){
                int n = SCANNER.nextInt();
                if(palindrome(n)){
                    enc=true;
                    System.out.println("palindrome");
                }
            }
        }
        if(!enc){
            System.out.println("attempts exceeded");
        }
    }
}
