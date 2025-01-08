import java.util.Scanner;

public class Questao3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite a letra F ou M: ");
            char sexo = scanner.next().toUpperCase().charAt(0);

            if (sexo == 'F') {
                System.out.println("F - Feminino");
            } else if (sexo == 'M') {
                System.out.println("M - Masculino");
            } else {
                System.out.println("Sexo inválido");
            }

            scanner.close();
        }
}
