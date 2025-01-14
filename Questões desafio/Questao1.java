//01- O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos (aplicados, primeiro os impostos sobre o custo de fábrica, e depois a percentagem do distribuidor sobre o resultado). Supondo que a percentagem do distribuidor seja de 28% e os impostos 45%. Escrever um programa que leia o custo de fábrica de um carro e informe o custo ao consumidor do mesmo.

import java.util.Scanner;
public class Questao1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o custo de fábrica: ");
        double custoFabrica = sc.nextDouble();

        //faz o calculo de 45% de imposto
        double valorImposto = (custoFabrica * 0.45);
        //faz o calculo de 28% do distribuidor sobre o custo de fabrica + imposto
        double valorDistribuidor =  (valorImposto + custoFabrica) * 0.28;
        //faz o valor final do carro
        double valorFinalCarro = valorImposto + valorDistribuidor + custoFabrica;

        System.out.printf("O valor do imposto sobre o carro: %.2f \n", valorImposto);
        System.out.printf("O valor de distribuidor: %.2f \n", valorDistribuidor);
        System.out.printf("O custo total do carro é de: %.2f \n", valorFinalCarro);

        sc.close();

    }

}