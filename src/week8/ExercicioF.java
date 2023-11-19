package week8;

import java.util.Scanner;

public class ExercicioF {
    static final Scanner SCANNER = new Scanner(System.in);

    static float calcularDinheiroEJuros(float dInicial, float[]taxas){
        for (int i = 0; i < taxas.length; i++) {
            dInicial += taxas[i] * dInicial;
        }
        return dInicial;
    }
    public static void main(String[] args) {
        float[] taxas = new float[6];
        for (int i=0; i < taxas.length; i++){
            taxas[i] = SCANNER.nextFloat();
        }
        int deposito = SCANNER.nextInt();
        float dinheiroF = calcularDinheiroEJuros((float) deposito, taxas);
        System.out.printf("final value=%.2f%n", dinheiroF);
    }
}
