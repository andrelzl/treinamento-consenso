import java.util.Scanner;
public class Questao12 {
    public static int getPorcentagemIR(double salarioBruto){
        if (salarioBruto <= 900){
            return 0;
        }else if(salarioBruto <= 1500){
            return 5;
        }else if(salarioBruto <= 2500){
            return 10;
        }else{
            return 20;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da sua hora tabalhada: R$ ");
        double valorHora = sc.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();

        double salarioBruto = valorHora * horasTrabalhadas;

        double descontoIR = 0;

        if(salarioBruto <= 900){
            descontoIR = 0;
        }else if(salarioBruto <= 1500){
            descontoIR = salarioBruto * 0.05;
        }else if (salarioBruto <= 2500){
            descontoIR = salarioBruto * 0.10;
        }else{
            descontoIR = salarioBruto * 0.20;
        }
        double descontoSindicato = salarioBruto * 0.03;
        double fgts = salarioBruto * 0.11;
        double descontoInss = salarioBruto * 0.10;
        double totalDescontos = descontoIR + descontoSindicato + descontoInss;
        double salarioLiquido = salarioBruto - totalDescontos;
        sc.close();
        System.out.println("Salário Bruto: " + horasTrabalhadas + " *R$" + valorHora + String.format("%.2f", salarioBruto));
        System.out.println("(-) IR (" + getPorcentagemIR(salarioBruto) + "%) : +  R$ " + String.format("%.2f", descontoIR ));
        System.out.println("(-) Sindicato (3%) : R$ " + String.format("%.2f", descontoSindicato));
        System.out.println("Valor a ser recolhido do FGTS (11%) : R$ " + String.format("5.2f", fgts));
        System.out.println("Total de descontos: R$ " + String.format("%.2f", totalDescontos));
        System.out.println("Salario Liquido: R$ " + String.format("%.2", salarioLiquido));
    }   
}


