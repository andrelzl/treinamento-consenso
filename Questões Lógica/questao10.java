import java.util.Scanner;
public class questao10 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Digite o raio de uma esfera: ");
        double raio = myObj.nextDouble();

        double volume = (4/3 * 3.14 * (raio * raio * raio));

        System.out.println("O volume da esfera é " + volume);
        myObj.close();
    }
}
