import java.util.Scanner;
import java.text.DecimalFormat;
public class Ex02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        
        System.out.println("Informe o preço do par de sapatos");
        double sapato = teclado.nextDouble();
        double Desconto = sapato*0.12;
        double preco = sapato - Desconto;

        System.out.println("o valor do desconto é R$ " + df.format(Desconto));
        System.out.println("O preço do par de sapatos com desconto é R$ " + df.format(preco));
        teclado.close();

    }
}
