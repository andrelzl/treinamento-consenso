import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero para o dia da semana: ");
        int numero = scanner.nextInt();

        if(numero == 1){
            System.out.println("Domingo");
        }else if(numero == 2){
            System.out.println("Segunda");
        }else if(numero == 3){
            System.out.println("Terça");
        }else if(numero == 4){
            System.out.println("Quarta");
        }else if(numero == 5){
            System.out.println("Quinta");
        }else if(numero == 6){
            System.out.println("Sexta");
        }else if(numero == 7){
            System.out.println("Sebado");
        }else{
            System.out.println("Inválido");
        }
        scanner.close();
    }
}
