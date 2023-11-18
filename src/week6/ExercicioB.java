package week6;

import java.util.Scanner;

public class ExercicioB {
    static Scanner scanner = new Scanner(System.in);
    static void aprovados(int alunos){
        String disc = scanner.next();
        int qntAprov = scanner.nextInt();
        System.out.println("Subject: "+ disc);
        System.out.print("- Approved: ");
        for(int i=0; i<qntAprov; i++){
            System.out.print('*');
        }
        System.out.println();
        System.out.print("- Failed: ");
        for(int i=0; i<(alunos - qntAprov); i++){
            System.out.print('*');
        }
        System.out.println();
    }
    public static void main(String[] args){
        int alunos = scanner.nextInt();
        int disciplinas = scanner.nextInt();
        for (int i=0; i<disciplinas; i++){
            aprovados(alunos);
        }
    }
}
