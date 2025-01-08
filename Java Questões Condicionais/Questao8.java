import java.util.Scanner;
public class Questao8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valoro de três produtos separados por espaçao: ");
        double protudo1 = scanner.nextDouble();
        double produto2 = scanner.nextDouble();
        double produto3 = scanner.nextDouble();

        if (protudo1 < produto2 && protudo1 < produto3){
            System.out.println("O menor valor é: " + protudo1);
        }else if(produto2 < protudo1 && produto2 < produto3){
            System.out.println("O menor valor é: " + produto2);
        }else{
            System.out.println("O menor valor é: " + produto3);
        }
        scanner.close();
    }
}