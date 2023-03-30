
import java.util.Scanner;
import java.text.DecimalFormat;


//Numa loja de materiais de construção, um azulejo estampado custa R$ 12,50. Faça um programa para ler o comprimento e altura de uma parede
 //(em metros), e depois escrever o valor gasto com a compra de azulejos. Considere que um metro quadrado é formado por 9 azulejos.
public class Ex13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("informe o comprimento da parede");
        double comprimento = teclado.nextDouble();
        System.out.println("informe a altura da parede");
        double altura = teclado.nextDouble();

        double metaju = (comprimento * altura) * 9;
        double azulejos = metaju * 12.50;
    
        System.out.println("o valor gasto com a compra de azulejos é " + azulejos);

        











    }
    
    

    
    
}
