import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.println("Informe o valor da base ");
        double base = teclado.nextDouble();
        System.out.println("informe o valor da altura");
        double altura = teclado.nextDouble();
        double area = base * altura;

        System.out.println("a área do terreno é " + df.format(area));
        teclado.close();
    }
}