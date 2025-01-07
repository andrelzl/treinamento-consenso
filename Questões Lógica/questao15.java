import java.util.Scanner;
public class questao15 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Digite o raio da base do cone");
        double raio = myObj.nextDouble();

        System.out.println("Digite a altura do cone");
        double altura = myObj.nextDouble();

        double resultado = (3.14 * (raio * raio) * altura)/3;

        System.out.println("O volume do cone é:" + resultado);
        myObj.close();
    }
}