import java.util.Scanner;
public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de x: ");
        double x = scanner.nextDouble();

        if (x>0){
            System.out.println("O valor de x é positivo");
            
        }else{
            System.out.println("O valor de x é negativo");
        }
        scanner.close();        
    }
    
}
