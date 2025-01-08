import java.util.Scanner;
public class questao21 {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("Digite o valor em metros quadrado: ");

        double metros = se.nextDouble();
        double litros = (metros/3);
        double latas = (litros/18);
        double preco = latas * 80;

        System.out.println("Vão ser precisas " + latas + " e o preço total ficou em: " + preco);
        se.close();
    }
}