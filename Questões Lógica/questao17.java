import java.util.Scanner;
public class questao17 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Digite sua altura: ");
        double altura = myObj.nextDouble();

        double resultado = (72.7 * altura) - 58;

        System.out.println("Seu peso ideal é: " + resultado);
        myObj.close();
    }
}
