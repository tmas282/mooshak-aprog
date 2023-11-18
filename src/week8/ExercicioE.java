package week8;

import java.util.Scanner;

public class ExercicioE {
    static final Scanner SCANNER = new Scanner(System.in);
    static char[][] nomes = new char[20][9];
    static float[] salarios = new float[20];

    static void lerNomesEVencimentos() {
        int i=0, k=0;
        boolean continuar = true;
        while(continuar){
            String nome = SCANNER.next();
            if(!nome.equals("end")){
                float salario = SCANNER.nextFloat();
                nomes[i] = nome.toCharArray();
                i++;
                salarios[k] = salario;
                k++;
            }
            else {
                continuar = false;
            }
        }

    }
    static float calcularMedia(float[] valores) {
        float nume=0, deno= (float) valores.length;
        for (int i = 0; i < valores.length; i++) {
            nume+=valores[i];
            if(valores[i] == 0){
                deno--;
            }
        }
        return nume / deno;
    }
    static void mostrarValores(float media, char[][] nomes, float[] valores) {
        System.out.printf("%.1f%n", media);
        for (int i = 0; i < valores.length; i++) {
            if(valores[i] != 0 && valores[i] < media){
                String nome = String.copyValueOf(nomes[i]);
                System.out.println(nome);
            }
        }
    }
    public static void main(String[] args) {
        lerNomesEVencimentos();
        float media = calcularMedia(salarios);
        mostrarValores(media, nomes, salarios);
    }
}
