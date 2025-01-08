import java.util.Scanner;
public class questao27 {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("Digite a quantidade de dolares a ser convertido: ");
        double dolar = se.nextDouble();

        System.out.println("Digite agora o valor da cotação atual do dolar: ");
        double cotacaoAtual = se.nextDouble();

        double conversao = dolar * cotacaoAtual;

        System.out.println("O valor convertido em real fica: " + conversao);
        se.close();
    }
}