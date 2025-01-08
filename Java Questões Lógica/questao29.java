import java.util.Scanner;
public class questao29 {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("Digite o valor da compra: ");
        double valorCompra = se.nextDouble();

        double prestacao = valorCompra/5;

        System.out.println("O valor das prestações ficam: " + prestacao);
        se.close();
    }
}