import java.util.Scanner;
public class Questao6 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Digite o raio: ");

        double raio = myObj.nextDouble();

        double areaCirculo = (2 * 3.14 * (raio*raio));

        System.out.println("A area do circulo é "+ areaCirculo);
        myObj.close();
    }
}
