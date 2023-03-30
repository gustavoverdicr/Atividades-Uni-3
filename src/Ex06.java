

import java.util.Scanner;
import java.text.DecimalFormat;
//Um restaurante cobra R$ 25,00 por cada quilo de refeição. 
//Escreva um programa que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar. O peso do prato é de 750 gramas.


public class Ex06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("informar peso do prato");
        double peso = teclado.nextDouble();

        double pesototal = peso - 0.75;
        double valor = pesototal * 25;

        System.out.println("o valor total a pagar é " +  df_2.format(valor) + "reais");
        teclado.close();

    }
}
