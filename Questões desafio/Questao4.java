//Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são: "Telefonou para a vítima?"
//"Esteve no local do crime?"
//"Mora perto da vítima?"
//"Devia para a vítima?"
//"Já trabalhou com a vítima?" O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".

import java.util.Scanner;
public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Responda as seguintes perguntas com S ou N");
        System.out.println("Telefonou para a vítima?");
        char pergunta1 = sc.next().toUpperCase().charAt(0);
        System.out.println("Esteve no local do crime?");
        char pergunta2 = sc.next().toUpperCase().charAt(0);
        System.out.println("Mora perto da vítima?");
        char pergunta3 = sc.next().toUpperCase().charAt(0);
        System.out.println("Devia para a vítima?");
        char pergunta4 = sc.next().toUpperCase().charAt(0);
        System.out.println("Já trabalhou com a vítima?");
        char pergunta5 = sc.next().toUpperCase().charAt(0);
        //contador
        int totalRespostasSim = 0; 

        if (pergunta1 == 'S'){
            totalRespostasSim += 1;
        }
        if (pergunta2 == 'S'){
            totalRespostasSim += 1;
        }
        if (pergunta3 == 'S'){
            totalRespostasSim += 1;
        }
        if (pergunta4 == 'S'){
            totalRespostasSim += 1;
        }
        if (pergunta5 == 'S'){
            totalRespostasSim += 1;
        }

        if (totalRespostasSim == 2){
            System.out.println("A pessoa está classificada como suspeita");
        }else if (totalRespostasSim == 3 || totalRespostasSim == 4){
            System.out.println("A pessoa está classificada como cumplice");
        }else if (totalRespostasSim == 5){
            System.out.println("A pessoa está classificada como Assasino");
        }else{
            System.out.println("A pessoa é inocente");
        }
        sc.close();
    }
}
