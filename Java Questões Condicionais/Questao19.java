import java.util.Scanner;
public class Questao19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero inteiro menor que 1000");
        int numero = sc.nextInt();

        if(numero < 1000){
            if(numero > 99 && numero < 100){
                int centena = Integer.parseInt(numero[0]);
            }
        }
    }
}
