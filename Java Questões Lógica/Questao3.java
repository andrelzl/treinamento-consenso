import java.util.Scanner;
public class Questao3 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Digite um numero:");

        int myNum1 = myObj.nextInt();
        int myNum2 = myObj.nextInt();
        int soma = myNum1 + myNum2;

        System.out.println("A soma de " + myNum1 + " e " + myNum2 + " foi: " + soma);
        
        myObj.close();
    }
}
