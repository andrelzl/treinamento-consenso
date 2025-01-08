import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a nota 1: ");
        double nota1 = scanner.nextDouble();
        
        System.out.println("Digite a nota 2: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7 && media < 10){
            System.out.println("Aprovado");  
        }else if(media == 10) { 
            System.out.println("Aprovado com Mérito");
        }else if (media >= 5 && media < 7){
            System.out.println("Recuperação");
        }else{
            System.out.println("Reprovado");
        }
        scanner.close();
    }
}
