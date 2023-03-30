import java.util.Scanner;
import java.text.DecimalFormat;

// Descreva um programa que a partir da distância percorrida e o do tempo gasto por um motorista durante uma viagem de final de semana, 
//calcule a velocidade média e a quantidade de combustível gasto na viagem, sabendo que o automóvel faz 12 km por litro.
public class Ex14 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("informe a distancia percorrida");
        double km = teclado.nextDouble();
        System.out.println("informe o tempo gasto em horas para a viagem");
        double tempo = teclado.nextDouble();

        double media = km/tempo;
        double combustivel = km/12;

        System.out.println(" a velocidade média do veiculo foi de " + df_2.format(media) +  " e a quantidade de combustivel gasto foi " + df_2.format(combustivel));

        teclado.close();
    }
}
