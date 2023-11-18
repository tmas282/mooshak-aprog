package week6;

import java.util.Scanner;

public class ExercicioI {
    final static Scanner SCANNER = new Scanner(System.in);
    public static boolean fibonacci(int n){
        int ultT=0, penultT=0, i=0, temp=0;
        boolean continuar=true;
        while (continuar){
            if(i==0){
                ultT=0;
            }
            else if (i==1) {
                ultT=1;
                penultT=0;
            }
            else{
                temp = ultT + penultT;
                penultT = ultT;
                ultT = temp;
                if(ultT == n){
                    return true;
                } else if (ultT > n) {
                    continuar=false;
                }
            }
            i++;
        }
        return false;
    }
    public static void main(String[] args) {
        int n = SCANNER.nextInt();
        if(fibonacci(n)){
            System.out.println("is a Fibonacci number");
        }
        else{
            System.out.println("is not a Fibonacci number");
        }
    }
}
