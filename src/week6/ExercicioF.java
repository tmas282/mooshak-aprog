package week6;

import java.util.Objects;
import java.util.Scanner;

public class ExercicioF {
    final static Scanner SCANNER = new Scanner(System.in);
    static float volCyl(float r, float h){
        double nume = Math.PI * Math.pow(r,2) * h;
        return (float) nume;
    }
    static float volCone(float r, float h){
        double nume = Math.PI * Math.pow(r,2) * h;
        return (float) (nume /3);
    }
    static float volSph(float r){
        double nume = 4 * Math.PI * Math.pow(r,3);
        return (float) (nume/3);
    }
    public static void main(String[] args) {
        boolean continuar = true;
        while (continuar){
            String solido = SCANNER.next();
            if(Objects.equals(solido, "end")){
                continuar = false;
            }
            else if(Objects.equals(solido, "cone")){
                float r = SCANNER.nextFloat();
                float h = SCANNER.nextFloat();
                System.out.printf("%.2f\n", volCone(r, h));
            }
            else if(Objects.equals(solido, "sphere")){
                float r = SCANNER.nextFloat();
                System.out.printf("%.2f\n", volSph(r));
            }
            else if (Objects.equals(solido, "cylinder")) {
                float r = SCANNER.nextFloat();
                float h = SCANNER.nextFloat();
                System.out.printf("%.2f\n", volCyl(r, h));
            }
        }
    }
}
