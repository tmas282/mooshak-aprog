//package week7;

import java.util.Scanner;

public class ExercicioK {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static int palindrome(int n){
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
        return numC;
    }
    public static void main(String[] args) {
        int num = Integer.parseInt(SCANNER.next());
        int temp=palindrome(num), soma=0, algAnterior=0;
        while(temp>0){
            int alg = temp % 10;
            temp /=10;
            if(algAnterior == alg){
                soma *= -1;
                soma -= alg;
            }
            else{
                soma += alg;
                algAnterior = alg;
            }
        }
        System.out.printf("points=%d\n", soma);
    }
}
