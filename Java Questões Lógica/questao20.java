import java.util.Scanner;
public class questao20 {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("Digite o numero de horas trabalhadas");
        double horasTrabalhadas = se.nextDouble();

        System.out.println("Digite quanto você ganha por hora: ");
        double ganhoHora = se.nextDouble();

        double salarioBruto = horasTrabalhadas * ganhoHora;

        double descontoIR = (0.11 * salarioBruto);
        double descontoINSS = (0.08 * salarioBruto);
        double descontoSindicato = (0.05 * salarioBruto);

        double salarioLiquido = salarioBruto - (descontoINSS + descontoIR + descontoSindicato);

        System.out.println("O usuario pagou ao INSS: " + descontoINSS + " pagou ao sindicato: " + descontoSindicato + " e seu salario liquido foi: " + salarioLiquido);
        se.close();
    }
}
