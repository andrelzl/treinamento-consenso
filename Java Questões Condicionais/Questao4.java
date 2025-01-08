import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        char letra = scanner.next().toLowerCase().charAt(0);

        if (Character.isLetter(letra)){
            if (letra == 'a'|| letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                System.out.println("A letra é uma vogal");
            }else{
                System.out.println("A letra é uma consoante");
            }    
        }else{
            System.out.println("O caractere digitado não é uma letra");
        }
        
        scanner.close();
    }
}
