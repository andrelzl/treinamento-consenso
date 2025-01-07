import java.util.Scanner;
public class questao9 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit: ");
        double tempFahrenheit = myObj.nextDouble();

        double conversão = (5* ((tempFahrenheit - 32)/ 9));

        System.out.println("O resultado da conversão é: " + conversão);
        myObj.close();
    }
}