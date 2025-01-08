import java.util.Scanner;
public class Questao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite em qual turno você estuda: M (Matutino), V (Vespertino) ou N (Noturno).");
        char turno = scanner.next().toUpperCase().charAt(0);

        if(turno =='M'){
            System.out.println("Bom dia!");
        }else if(turno == 'V'){
            System.out.println("Boa tarde!");
        }else if(turno == 'N'){
            System.out.println("Boa noite!");
        }else{
            System.out.println("Valor inválido!");
        }
        scanner.close();
    }
}
