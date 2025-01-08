import java.util.Scanner;
public class questao24 {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        double numero1 = se.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double numero2 = se.nextDouble();

        double soma = numero1 + numero2;
        double subt = numero1 - numero2;
        double div = (numero1/numero2);
        double multi = numero1*numero2;

        System.out.println("O resultado da soma: " + soma + ", resultado da subtração: " + subt + ", o resultado da divisão: " + div + " e o resultado da multiplicação: " + multi);
        se.close();

    }
}