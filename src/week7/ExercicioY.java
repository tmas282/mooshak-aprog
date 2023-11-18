package week7;

import java.util.Scanner;

public class ExercicioY {
    static final Scanner SCANNER = new Scanner(System.in);
    public static int readPositiveValue(){
        int n;
        do {
            n = SCANNER.nextInt();
        } while(!(n>0));
        return n;
    }
    public static void showTablesInRange(int v1, int v2){
        int fimInterv = v2;
        int inicioInterv = v1;
        if(v1 > v2){
            fimInterv = v1;
            inicioInterv = v2;
        }
        for (int i = inicioInterv; i <= fimInterv; i++) {
            showTableOfNumber(i);
        }
    }
    public static void showTableOfNumber(int n){
        System.out.printf("Multiplication table of %d%n",n);
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", n, i, n*i);
        }
    }
    public static void main(String[] args) {
        int vInter1 = readPositiveValue(), vInter2 = readPositiveValue();
        showTablesInRange(vInter1, vInter2);
    }
}
