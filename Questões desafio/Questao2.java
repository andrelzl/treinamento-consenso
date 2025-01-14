//Faça um programa que receba a soma de todas as verbas recebidas por um  funcionário no mês(salario, horas-extras e comissões) em uma variável do tipo real denominada Salário Bruto. Após o recebimento calcule e exiba na tela o valor do imposto de renda, o valor do INSS e o salário líquido que é obtido abatendo-se do Salário Bruto da soma dos descontos.
//Valor Imposto de renda: 5% sobre o salário Bruto
//Valor INSS: 11% sobre o salário Bruto

import java.util.Scanner;
public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu Salario: ");
        double salario = sc.nextDouble();
        System.out.println("Digite o valor de horas-extras recebidos");
        double horaExtra = sc.nextDouble();
        System.out.println("Digite o valar de comissões: ");
        double comissao = sc.nextDouble();

        //soma do salario bruto
        double salarioBruto = salario + horaExtra + comissao;
        //descontos de impopstos
        double impostoRenda = salarioBruto * 0.05;
        double inss = salarioBruto * 0.11;
        //descontando para salario liquido
        double salarioLiquido = salarioBruto - impostoRenda - inss;
        
        System.out.printf("O valor do seu salario bruto: %.2f \n", salarioBruto);
        System.out.printf("O desconto sobre imposto de renda: %.2f \n", impostoRenda);
        System.out.printf("O desconto do INSS: %.2f \n", inss);
        System.out.printf("O valor do seu salário liquido: %.2f", salarioLiquido);
        sc.close();
    }
}
