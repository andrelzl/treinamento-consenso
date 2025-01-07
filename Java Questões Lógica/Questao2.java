import java.util.Scanner;
public class Questao2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Digite um numero:");

        int myNum = myObj.nextInt();
        System.out.println("O numero digitado foi: " + myNum);
        myObj.close();
    }
}
