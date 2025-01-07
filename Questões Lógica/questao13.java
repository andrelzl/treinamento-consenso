import java.util.Scanner;
public class questao13 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Digite a largura do retangulo");
        double largura = myObj.nextDouble();

        System.out.println("Digite a altura do retangulo");
        double altura = myObj.nextDouble();

        double resultado = (largura *altura);

        System.out.println("A area do retangulo é " + resultado);
        myObj.close();
    }
}