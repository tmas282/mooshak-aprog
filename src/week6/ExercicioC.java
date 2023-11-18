package week6;

import java.util.Scanner;

public class ExercicioC {
    final static Scanner SCANNER = new Scanner(System.in);
    public static void calcularAng(float a, float b, float c){
        double angAB = (Math.acos((Math.pow(a, 2)+ Math.pow(b,2) - Math.pow(c,2)) / (2*a*b)) * 180) / Math.PI;
        double angAC = (Math.acos((Math.pow(a, 2)+ Math.pow(c,2) - Math.pow(b,2)) / (2*a*c)) * 180) / Math.PI;
        double angBC = (Math.acos((Math.pow(b, 2)+ Math.pow(c,2) - Math.pow(a,2)) / (2*b*c)) * 180) / Math.PI;
        if((int) (angAB + angAC + angBC) != 180 || angAB == 0 || angAC == 0 || angBC == 0){
            System.out.println("impossible");
        }
        else{
            System.out.printf("a=%.2f\n", a);
            System.out.printf("b=%.2f\n", b);
            System.out.printf("c=%.2f\n", c);
            System.out.printf("ang(a,b)=%.2f\n", angAB);
            System.out.printf("ang(a,c)=%.2f\n", angAC);
            System.out.printf("ang(b,c)=%.2f\n", angBC);
        }
    }

    public static void main(String[] args) {
        float a = SCANNER.nextFloat();
        float b = SCANNER.nextFloat();
        float c = SCANNER.nextFloat();
        calcularAng(a,b,c);
    }
}
