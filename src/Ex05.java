import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex05 { 
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("informe o numero de frango ");
        double frango = teclado.nextDouble();
        double precoaneis = 4.0 + 7.0;
        double gasto = frango * precoaneis;

        System.out.println("o gasto total da granja para marcar todos os frangos é R$ " + df_2.format(gasto));
        teclado.close();

}    
}