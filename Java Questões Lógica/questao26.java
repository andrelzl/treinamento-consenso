import java.util.Scanner;
public class questao26 {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int a = se.nextInt();

        System.out.println("Digite outro numero inteiro: ");
        int b = se.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Agora o primeiro numero valor " + a + " e o segundo numero vale: " + b);
        se.close();
    }
}