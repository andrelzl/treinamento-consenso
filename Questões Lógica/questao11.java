import java.util.Scanner;
public class questao11 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Digite a base do triangulo");
        double base = myObj.nextDouble();

        System.out.println("Digite a altura do triangulo");
        double altura = myObj.nextDouble();

        double resultado = (base *altura)/2;

        System.out.println("A area do triangulo é " + resultado);
        myObj.close();
    }
}
