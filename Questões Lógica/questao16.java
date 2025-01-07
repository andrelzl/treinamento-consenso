import java.util.Scanner;
public class questao16 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Digite o valor a ser convertido: ");        
        double kg = myObj.nextDouble();

        double resultado = kg * 2.20462;

        System.out.println("O resulta da conversão é: " + resultado);
        myObj.close();
    }
}
