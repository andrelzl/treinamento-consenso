import java.util.Scanner;
public class questao12 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Digite a base do cilindro");
        double base = myObj.nextDouble();

        System.out.println("Digite a altura do cilindro");
        double altura = myObj.nextDouble();

        double raio = base/2;
        double resultado = 3.14 * (raio * raio) * altura;

        System.out.println("O volume do cilindro é " + resultado);
        myObj.close();
    }
}