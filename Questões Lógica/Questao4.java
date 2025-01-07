import java.util.Scanner;
public class Questao4 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Digite suas 4 notas:");
        System.out.println("Digite a nota 1:");
        double nota1 = myObj.nextDouble();
        System.out.println("Digite a nota 2:");
        double nota2 = myObj.nextDouble();
        System.out.println("Digite a nota 3:");
        double nota3 = myObj.nextDouble();
        System.out.println("Digite a nota 4:");
        double nota4 = myObj.nextDouble();

        double media = ((nota1 + nota2 + nota3 + nota4)/4);

        System.out.println("A media da notas "+ nota1 +", "+ nota2 +", "+ nota3 +" e " + nota4 + " é: " + media);
        
        myObj.close();
    }
}
