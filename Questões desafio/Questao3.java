//Construa um algoritmo para determinar se o indivíduo está com um peso favorável ou não. Essa situação é determinada através do IMC ( Índice de MassaCorpórea), que é definida como sendo a relação entre o peso (PESO) e o quadrado da Altura (ALTURA) do indivíduo.

import java.util.Scanner;
public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu peso: ");
        double peso = sc.nextDouble();
        System.out.println("Digite sua altura");
        double altura = sc.nextDouble();

        double imc = (peso)/(altura*altura);

        if(imc <= 18.5){
            System.out.printf("Seu imc é: %.1f\n", imc);
            System.out.printf("Sua classificação é: Abaixo do peso");
        }else if(imc > 18.5 && imc <= 25){
            System.out.printf("Seu imc é: %.1f\n", imc);
            System.out.printf("Sua classificação é: Peso Normal");
        }else if(imc > 25 && imc <= 30){
            System.out.printf("Seu imc é: %.1f\n", imc);
            System.out.printf("Sua classificação é: Sobre peso");
        }else if(imc > 30 && imc <= 39){
            System.out.printf("Seu imc é: %.1f\n", imc);
            System.out.printf("Sua classificação é Obeso");
        }else{
            System.out.printf("Seu imc é: %.1f\n", imc);
            System.out.printf("Sua classificação é Obeso Mórbido");
        }
        sc.close();

    }
}
