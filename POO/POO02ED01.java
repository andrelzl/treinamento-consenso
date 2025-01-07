import java.util.Scanner;
public class POO02ED01 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("digite dois numeros");

        int numero1 = myObj.nextInt();
        int numero2 = myObj.nextInt();

        if (numero1 > numero2){
            System.out.println("O maior numero é: " + numero1);
        }
        else{
            System.out.println("O maior numero é: " + numero2);
        }
        myObj.close();
    }
}
