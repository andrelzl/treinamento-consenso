import java.util.Scanner;
public class questao8 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Quanto voce ganha por hora:");
        double ganhoHora = myObj.nextDouble();

        System.out.println("Quantas horas voce trabalha:");
        double horasTrabalhadas = myObj.nextDouble();

        double resultado = ganhoHora * horasTrabalhadas;

        System.out.println("Seu salario esse mes é " + resultado);
        myObj.close();
    }
}