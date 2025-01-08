import java.util.Scanner;
public class Questao19 {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("Digite o peso total: ");

        double peso = se.nextDouble();
        double excedente = peso - 50;
        double multa = excedente * 4;

        System.out.println("O peso excedente é: " + excedente + " e a multa é de: " + multa );
        se.close();
    }
}
