import java.util.Scanner;
public class Questao7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite três numeros separados por espaçao: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();

        if(x > y && x > z){
            System.out.println("O maior valor é: " + x);
        }else if(y > x && y > z){
            System.out.println("O maior valor é: " + y);
        }else{ 
            System.out.println("O maior valor é: " + z);
        }
        if (x < y && x < z){
            System.out.println("O menor valor é: " + x);
        }else if(y < x && y < z){
            System.out.println("O menor valor é: " + y);
        }else{
            System.out.println("O menor valor é: " + z);
        }
        scanner.close();
    }
}