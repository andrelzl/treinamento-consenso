import java.util.Scanner;
public class Questao5 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Digite quantos metros você deseja converter: ");

        double metros = myObj.nextDouble();

        double cm = metros * 100;

        System.out.println("A conversão deu: " + cm);
        myObj.close();
    }
}
