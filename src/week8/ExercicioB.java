package week8;

import java.util.Scanner;

public class ExercicioB{
    static final Scanner SCANNER = new Scanner(System.in);

    public static int[] lerValores(int[] values){
        int i=0;
        while (true){
            int temp = SCANNER.nextInt();
            if(temp > 0){
                values[i] = temp;
                i++;
            }
            else{
                return values;
            }
        }
    }
    public static int minimo(int[] values){
        int min = 0;
        for (int i = 0; i < values.length; i++) {
            if(i==0){
                min = values[i];
            }
            if(min > values[i] && values[i] !=0){
                min = values[i];
            }
        }
        return min;
    }
    public static int qntOcurrencias(int[] values, int valor){
        int qnt = 0;
        for (int i = 0; i < values.length; i++) {
            if(values[i] == valor){
                qnt++;
            }
        }
        return qnt;
    }
    public static void main(String[] args) {
        int[] values = lerValores(new int[20]);
        int min = minimo(values);
        if(min > 0){
            System.out.printf("min=%d%n", min);
            System.out.printf("occurrences=%d%n", qntOcurrencias(values, min));
        }
    }
}
