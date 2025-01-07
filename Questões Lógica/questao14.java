import java.util.Scanner;
public class questao14 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Digite a aresta de um cubo");
        double aresta = myObj.nextDouble();

        double resultado = (aresta*aresta*aresta);

        System.out.println("O volume do cube é: " + resultado);
        myObj.close();
    }
}