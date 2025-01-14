import java.util.Scanner;
public class Questao15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe os três lados de um triângulo separados por espaço ");
        double lado1 = sc.nextDouble();
        double lado2 = sc.nextDouble();
        double lado3 = sc.nextDouble();
        if((lado1 + lado2) > lado3 || (lado1 + lado3) > lado2 || (lado2 + lado3) > lado1){
            if(lado1 == lado2 && lado2 == lado3){
                System.out.println("O tipo do triângulo é: Equilátero");
            }else if((lado1 == lado2) || (lado1 == lado3) || (lado3 == lado2)){
                System.out.println("O tipo do triângulo é: Isósceles");
            }else{
                System.out.println("O tipo do triângulo é: Escaleno");
            }   
        }else{
            System.out.println("Não é um trinângulo");
        }
        sc.close();
    }
}
