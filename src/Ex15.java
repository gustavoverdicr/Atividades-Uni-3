

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);

        System.out.println("digite o numero para separar as unidades");
        int numero = (int) teclado.nextDouble();

        int centena = numero/100;
        int dezena = (numero - centena*100)/10;
        int unidade = numero - centena*100 - dezena*10;

        System.out.println("a centena é " + centena + " a dezena é " + dezena + " e a unidade é " + unidade );
        teclado.close();


    }
}



        









    

