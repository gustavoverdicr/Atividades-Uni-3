import java.util.Scanner;
import java.text.DecimalFormat;



public class Ex07 {
public static void main(String[] args) {
    //Uma fábrica de refrigerantes vende seu produto em três formatos
    //: lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros. Se um comerciante compra uma determinada quantidade de cada formato, 
    //faça um programa para calcular quantos litros de refrigerante ele comprou.
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

System.out.println("quantas latas foram compradas?");
double lata = teclado.nextDouble();
System.out.println("quantas garrafas foram compradas?");
double garrada = teclado.nextDouble();
System.out.println("quantas garrafonas de 2L foram compradas");
double garrafona = teclado.nextDouble();

double llata= lata*0.35;
double lgarrafa= garrada*0.6;
double lgarrafona = garrafona*2.0;
double qtdlitros= llata + lgarrafa + lgarrafona;

System.out.println("a quantidade de litros de refrigerante comprada é "+ df_2.format(qtdlitros) + "litros");
teclado.close();








}
    
}
