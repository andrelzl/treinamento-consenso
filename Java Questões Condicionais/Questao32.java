import java.util.Scanner;
public class Questao32 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //solicita ao usuario 5 digitos
        System.out.println("Digite um numero de 5 digitos: ");
        String numero = sc.nextLine();
        //verefica se o numero está correto
        if (numero.length() != 5 || !numero.matches("\\d+")){
            System.out.println("Erro: Você deve digitar um numero exatamente com 5 digitos.");
        }else{
            if (isPalindromo(numero)){
                System.out.println("O número " + numero + " é um palíndromo.");
            }else{
                System.out.println("O número" + numero + "não é um palíndromo.");
            }
        }
        sc.close();
    }
    public static boolean isPalindromo(String numero){
        int n = numero.length();
        for (int i = 0; i < n / 2; i++){
            if (numero.charAt(i) != numero.charAt(n -1 -i)){
                return false;
            }
        }
        return true;
    }
}

