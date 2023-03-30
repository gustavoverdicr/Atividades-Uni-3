import java.util.Scanner;



import java.text.DecimalFormat;


public class Ex08 {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");
//Uma pessoa foi até uma casa de câmbio trocar dólares por reais. Para isto ela entregou um valor em dólares para o atendente.
// Considerando que o atendente tem a cotação do dólar, descreva um programa para calcular quantos reais o atendente deve devolver para a pessoa.
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

    System.out.println("informe o valor em dolares");
    double dolares = teclado.nextDouble();

    double reais = dolares/5.25;
    System.out.println("seus dolares deram " + df_2.format(reais) + "reais");
    teclado.close();




}

    
}
