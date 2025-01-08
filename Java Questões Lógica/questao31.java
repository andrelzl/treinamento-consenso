import java.util.Scanner;
public class questao31 {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("Digite sua idade em anos, depois meses, e depois dias (separados por espaço): ");

        int anos = se.nextInt();
        int meses = se.nextInt();
        int dias = se.nextInt();

        double calculo = ((anos * 12)*30) + (meses * 30) + dias;

        System.out.println("O resultado é " + calculo + " dias.");
        se.close();
    }
} 