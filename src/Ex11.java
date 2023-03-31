import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");
    System.out.println("Informe a temperatura em graus Celsius");
    double tempcelsius = teclado.nextDouble();
    
    double F = (9.0/5.0) * tempcelsius + 32;
    System.out.println("a temperatura em Fahrenheit é " + df_2.format(F));
    teclado.close();
    }
}
