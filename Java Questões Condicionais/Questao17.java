import java.util.Scanner;
public class Questao17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Infome o ano para saber se é bissexto: ");
        int ano = sc.nextInt();
        if(ano%4 == 0){
            System.out.println(ano + " é ano bissexto ");
        }else{
            System.out.println("Não é ano bissexto");
        }
        sc.close();
    }
}
