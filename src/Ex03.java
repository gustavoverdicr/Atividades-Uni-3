import java.util.Scanner;
import java.text.DecimalFormat;


public class Ex03 {
    //Um motorista deseja abastecer seu tanque de combustível. Escreva um programa para ler 
    //o preço do litro da gasolina e o valor do pagamento e exibir quantos litros ele conseguiu colocar no tanque.
    static Scanner teclado = new Scanner(System.in);
    static DecimalFormat df_2 = new DecimalFormat("0.00");


    public static void main(String[] args) {
    System.out.print("informe o preço do litro da gasolina");
    double precogasolina = teclado.nextDouble();  
    System.out.print("informe o pagamento do motorista");
    double pagamento = teclado.nextDouble();

    double litroscompr = pagamento/precogasolina; 
    System.out.println("ele conseguiu comprar " + df_2.format(litroscompr) + "litros ");
    }
}
