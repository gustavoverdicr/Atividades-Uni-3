import java.util.Scanner;
import java.text.DecimalFormat;

//Faça um programa para ler três notas de um aluno em uma disciplina e imprimira sua média ponderada (as notas tem pesos respectivos de 5, 3 e 2).



public class Ex04 {
    
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
       
        System.out.print("informe a nota 1");
        double nota1 = teclado.nextDouble();
        System.out.println("informe a nota 2");
        double nota2 = teclado.nextDouble();
        System.out.println("informe a nota 3");
        double nota3 = teclado.nextDouble();

        double nota1real = nota1 * 5;
        double nota2real = nota2 * 3;
        double nota3real = nota3 * 2;
        double media = (nota1real + nota2real + nota3real)/10;
        
        System.out.println("a media do aluno é " + media   );
   
   
   
   
   
   
   
   
   
    }
}
