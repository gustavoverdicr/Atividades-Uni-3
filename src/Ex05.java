import java.util.Scanner;
import java.text.DecimalFormat;

//Faça um programa para ler três notas de um aluno em uma disciplina e imprimira sua média ponderada (as notas tem pesos respectivos de 5, 3 e 2).



public class Ex05 { 
    
    
    
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            DecimalFormat df_2 = new DecimalFormat("0.00");
      
            System.out.print("informe o numero de frangos");
            double frangos = teclado.nextDouble();
            double precoaneis = 4 + 7;

            double gasto = frangos * precoaneis; 
            System.out.println("o gasto com frangos foi " + df_2.format(gasto) + "reais"  );
        }
     } 
    }
