package week7;

import java.util.Scanner;

public class ExercicioL {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        String str = SCANNER.nextLine();
        str = str.trim();
        int palavras = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ' && i+1 < str.length() && str.charAt(i+1) != ' '){
                palavras++;
            }
            if(str.charAt(i) != ' ' && i+1 >= str.length()){
                palavras++;
            }
        }
        System.out.println(palavras);
    }
}
