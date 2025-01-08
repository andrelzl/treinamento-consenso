import java.util.Scanner;
public class questao22 {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("Digite o valor em metros quadrado: ");

        double metros = se.nextDouble();
        double litros = (metros/6);
        double latas = (litros/18);
        double galoes = (litros/3.6);
        double precoLatas = latas * 80;
        double precoGaloes = galoes * 25;

        System.out.println("Vão ser precisas " + latas + " latas e o preço total ficou em: " + precoLatas);
        System.out.println("Vão ser precisas " + galoes + " galões e o preço total ficou em: " + precoGaloes);
        se.close();
    }
}