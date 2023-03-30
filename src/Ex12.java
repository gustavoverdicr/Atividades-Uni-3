

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex12 {
    //Uma empresa tem para um funcionário os seguintes dados: o nome, o número de horas trabalhadas mensais e o número de dependentes. 
    //A empresa paga R$ 10,00 por hora (valor para cálculo do salário trabalho) e R$ 60,00 por dependente (valor para cálculo do salário família) e são
     //feitos descontos de 8,5% sobre o salário trabalho para o INSS e de 5% sobre o salário trabalho para o imposto de renda. Descreva um programa que informe o nome,
      //o salário bruto e o salário líquido do funcionário.










    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

    System.out.println("informe o nome do funcionario");
    String nome = teclado.nextLine();
    System.out.println("informe o numero de horas trabalhadas");
    double horas = teclado.nextDouble();
    System.out.println("informe o numero de dependentes");
    double depe = teclado.nextDouble();

    double salariobruto = 10 * horas + 60 * depe;
    double salariofinal = salariobruto * 13.5/100;
    double salariomassa = salariobruto - salariofinal;

    System.out.println("o funcionario " + nome + " recebe um salario bruto de " + salariobruto + "e um salario liquido de " + salariomassa);







    }
}
