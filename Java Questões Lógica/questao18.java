import java.util.Scanner;
public class questao18 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Digite sua altura");
        double altura = myObj.nextDouble();

        double pesoHomem = (72.7 * altura) - 58;
        double pesoMulher = (62.1 * altura) - 44.7;

        System.out.println("O peso ideal para homem é " + pesoHomem + ", e para mulher é "+ pesoMulher);
        myObj.close();
    }
}
