package week7;

import java.util.Scanner;

public class ExercicioZ {
    static final Scanner SCANNER = new Scanner(System.in);
    public static boolean ePrimo(int n){
        for (int i = 2; i < n; i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean ePrimoCompleto(int n){
        int temp=n, ordem=-1;
        while(temp>0){
            temp /=10;
            ordem++;
        }
        temp=n;
        for(int i=0; i<=ordem;i++){
            int deslocado = temp / 10;
            deslocado += (temp % 10) * Math.pow(10, ordem);
            temp = deslocado;
            if(!ePrimo(deslocado)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int iInterv = SCANNER.nextInt(), fInterv = SCANNER.nextInt(), qnt=0;
        for (int i = iInterv; i <= fInterv; i++) {
            if(ePrimoCompleto(i)){
                System.out.println(i);
                qnt++;
            }
        }
        System.out.printf("(%d)%n",qnt);
    }

}
