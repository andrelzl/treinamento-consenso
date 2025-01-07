import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Digite o tamanho do lado: ");

        double lado = myObj.nextDouble();
        double areaQuadrado = lado * lado;
        double dobroArea = areaQuadrado * 2;

        System.err.println("O dobro da area é: " + dobroArea);
        myObj.close();
    }
}