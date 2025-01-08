import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu salário ");
        double salario = scanner.nextDouble();

        if(salario <= 280){
            double novoSalario = salario * 1.20;
            double valorDeAumento = salario * 0.20;
            System.out.println("Salário antes: " + salario);
            System.out.println("20%");
            System.out.println("O valor de aumento foi: " + valorDeAumento);
            System.out.println("Seu novo salario é de: " + novoSalario);
        }
        else if(salario > 280 && salario <= 700){
            double novoSalario = salario * 1.15;
            double valorDeAumento = salario * 0.15;
            System.out.println("Salário antes: " + salario);
            System.out.println("15%");
            System.out.println("O valor de aumento foi: " + valorDeAumento);
            System.out.println("Seu novo salario é de: " + novoSalario);
        }
        else if(salario > 700 && salario <= 1500){
            double novoSalario = salario * 1.1;
            double valorDeAumento = salario * 0.1;
            System.out.println("Salário antes: " + salario);
            System.out.println("10%");
            System.out.println("O valor de aumento foi: " + valorDeAumento);
            System.out.println("Seu novo salario é de: " + novoSalario);
        }
        else if (salario > 1500){
            double novoSalario = salario * 1.05;
            double valorDeAumento = salario * 0.05;
            System.out.println("Salário antes: " + salario);
            System.out.println("5%");
            System.out.println("O valor de aumento foi: " + valorDeAumento);
            System.out.println("Seu novo salario é de: " + novoSalario);
        }else{
            System.out.println("Houve algum erro!");
        }
        scanner.close();
    }
}
