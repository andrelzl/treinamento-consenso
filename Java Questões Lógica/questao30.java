import java.util.Scanner;
public class questao30 {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("Digite o nome do vendedor: ");
        String nomeFuncionario = se.nextLine();

        System.out.println("Digite o salario fixo: ");
        double salarioFixo = se.nextDouble();

        System.out.println("Digite o valor em vendas: ");
        double vendasMes = se.nextDouble();

        double comissao = vendasMes * 0.15;
        double salarioComComissao = comissao + salarioFixo;

        System.out.println("Nome: "+ nomeFuncionario);
        System.out.println("Salario Fixo: "+ salarioFixo);
        System.out.println("Salario com comissão: "+ salarioComComissao);
        se.close();
    }
}