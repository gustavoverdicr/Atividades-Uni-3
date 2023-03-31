import java.util.Scanner;
import java.text.DecimalFormat;


public class Ex10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");
        
        System.out.println("informe o cateto1");
        double cateto1 = teclado.nextDouble();
        System.out.println("inoforme o cateto 2");
        double cateto2= teclado.nextDouble();

        double hipotenusa = Math.pow(cateto1, 2) + Math.pow(cateto2, 2);
        double rhipotenuda = Math.sqrt(hipotenusa);
        System.out.println("o valor da hipotenusa é eae irmão " + df_2.format(rhipotenuda));
        teclado.close();
        
    
    }
    
}
