import java.util.Scanner;
public class questao28 {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("Digite o valor de deposito: ");
        double deposito = se.nextDouble();

        double rendimento = deposito * 1.0050;

        System.out.println("O valor de rendimento foi: " + rendimento);
        se.close();
    }
}