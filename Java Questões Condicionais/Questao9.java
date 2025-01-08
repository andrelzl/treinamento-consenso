import java.util.Scanner;
public class Questao9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite três numeros separados por espaço: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();

        if (x > y && y > z){
            System.out.println("a ordem decrescente é: " + x + " " + y + " " + z);
        }else if (x > z && z > y){
            System.out.println("a ordem decrescente é: " + x + " " + z + " " + y);
        }else if (y > x && x > z){
            System.out.println("a ordem decrescente é: " + y + " " + x + " " + z);
        }else if (y > z && z > x){
            System.out.println("a ordem decrescente é: " + y + " " + z + " " + x);
        }else if (z > x && x > y){
            System.out.println("a ordem decrescente é: " + z + " " + x + " " + y);
        }else{
            System.out.println("a ordem decrescente é: " + z + " " + y + " " + x);
        }
        scanner.close();
    }
}
