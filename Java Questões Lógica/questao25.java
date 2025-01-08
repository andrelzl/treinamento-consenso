import java.util.Scanner;
public class questao25 {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("Digite o primeiro numero inteiro: ");
        int numeroInteiro1 = se.nextInt();

        System.out.println("Digite o segundo numero inteiro: ");
        int numeroInteiro2 = se.nextInt();

        System.out.println("Digite um numero real");
        double numero3 = se.nextDouble();

        double equacao1 = (2*numeroInteiro1) + (numeroInteiro2/2);
        double equacao2 = (numeroInteiro1*3) + numero3;
        double equacao3 = (numero3 * numero3 * numero3);

        System.out.println("Primeira equação: " + equacao1 + " segunda equação: " + equacao2  + " terceira equação: " + equacao3);
        se.close();
    }
}