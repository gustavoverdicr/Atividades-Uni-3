import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("escreva o preço da compra");
        int compra = (int) teclado.nextDouble();
        System.out.println("informe o valor do pagamento");
        int pagamento = (int) teclado.nextDouble();
        
        int troco = pagamento - compra;


        int centena = troco/100;
        int dezena = (troco - centena*100)/10;
        int unidade = troco - centena*100 - dezena*10;

        System.out.println("o troco tem " + centena + " notas de 100 " + dezena + " notas de 10 e " + unidade + " notas de 1 ");
        teclado.close();


    


    }
}