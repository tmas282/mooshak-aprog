package week6;

import java.util.Scanner;

public class ExercicioA{
    static final int K=5;
    static int qntDigitos(int n){
        int qnt = 0;
        while(n>0){
            qnt++;
            n /=10;
        }
        return qnt;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int qntTotalDig = scanner.nextInt(), nume=0, deno=0;
        boolean parar = false;
        for (int i=1; i<=K; i++){
            if(!parar){
                int n = scanner.nextInt();
                if(qntDigitos(n) >= qntTotalDig){
                    parar = true;
                }
                else{
                    nume+=n;
                    deno++;
                }
            }
        }
        if(deno==0){
            deno=1;
        }
        float media = (float)nume / (float) deno;
        System.out.println(String.format("%.2f", media));
    }
}