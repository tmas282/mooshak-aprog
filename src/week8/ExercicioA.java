package week8;

import java.util.Scanner;

public class ExercicioA {
    static final Scanner SCANNER = new Scanner(System.in);
    public static float media(int[] values){
        float media = 0;
        for (int i = 0; i < values.length; i++) {
            media += values[i];
        }
        media /= values.length;
        return media;
    }
    public static int obterQntFailures(int[] values){
        int qntFailures = 0;
        for(int i=0; i<values.length; i++){
            if(values[i] < 10){
                qntFailures++;
            }
        }
        return qntFailures;
    }
    public static void main(String[] args) {
        int n = SCANNER.nextInt();
        int[] notas = new int[n];
        for(int i=0; i<n; i++){
            notas[i] = SCANNER.nextInt();
        }
        System.out.printf("average=%.1f%n", media(notas));
        System.out.printf("failures=%d%n", obterQntFailures(notas));
    }
}
