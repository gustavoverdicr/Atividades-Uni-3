import java.util.Scanner;
import java.text.DecimalFormat;


public class Ex09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");
    System.out.println("informe o raio da lata");
    double raio = teclado.nextDouble();
    System.out.println("informe a altura ");
    double altura = teclado.nextDouble();

    double volume = Math.PI * Math.pow(raio, 2) * altura;
    System.out.println("o volume da lata é " + df_2.format(volume) + "metros cubicos");
    teclado.close();

    }
}
