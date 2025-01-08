import java.util.Scanner;
public class questao23 {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("Informe o valor em MB");
        double tamanhoArquivo = se.nextDouble();

        System.out.println("Informe a velocidade");
        double velocidade = se.nextDouble();

        double velocidadeMbps = velocidade * 0.125;

        double tempoSegundos = tamanhoArquivo / velocidadeMbps;

        double tempoMinutos = tempoSegundos / 60;

        System.out.println("O tempo aproximado de download será: " + tempoMinutos + " minutos");
        se.close();
    }
}