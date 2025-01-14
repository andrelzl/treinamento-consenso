import java.util.Scanner;
public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        double salario;
        char sexo, estadoCivil;

        do{
            System.out.println("Digite seu nome: ");
            nome = sc.nextLine();
            System.out.println("Digite sua idade: ");
            idade = sc.nextInt();
            System.out.println("Digite seu salário: ");
            salario = sc.nextDouble();
            System.out.println("Digite seu sexo: ('F' ou 'M')");
            sexo = sc.next().toUpperCase().charAt(0);
            System.out.println("Digite seu estado civil: ('S', 'C', 'V' ou 'D')");
            estadoCivil = sc.next().toUpperCase().charAt(0);

            if (nome.length() < 4){
                System.out.println("Nome invalido! Digit novamente.");
            }else if( idade < 0 || idade > 150){
                System.out.println("Idade Invalida! Digite novamente.");
            }else if(salario < 0){
                System.out.println("Salário Invalido! Digite novamente.");
            }else if(sexo != 'F' || sexo != 'M'){
                System.out.println("Sexo Invalido! Digite novamente.");
            }else if (estadoCivil != 'C' || estadoCivil != 'S' || estadoCivil != 'v' || estadoCivil != 'D') {
                System.out.println("Estado Civil invalido! Digite novamente.");
            }
        }while(estadoCivil != 'C' || estadoCivil != 'S' || estadoCivil != 'v' || estadoCivil != 'D');
        System.out.println("Tudo correto!");
        sc.close();
    }
}
