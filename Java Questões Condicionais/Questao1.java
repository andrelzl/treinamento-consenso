import java.util.Scanner;
public class Questao1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de x: ");
        double x = scanner.nextDouble();

        System.out.println("Digite o valor de y: ");
        double y = scanner.nextDouble();

        if(x > y){
            System.out.println("O maior valor é: " + x);
        }else{
            System.out.println("O maior valor é: " + y);
        }
        scanner.close();
    }
}