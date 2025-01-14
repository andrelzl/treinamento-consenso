import java.util.Scanner;
public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName, passWord;

        do{
            System.out.println("Digite o seu Usuário: ");
            userName = sc.nextLine();

            System.out.println("Digite sua senha: ");
            passWord = sc.nextLine();

            if(userName.equals(passWord)){
                System.out.println("Erro: A senha não pode ser igual ao nome de usuário. Tente novamente");
                
            }
        }while(userName.equals(passWord));
        System.out.println("Usuário e senha cadastrados com sucesso!");

        sc.close();
    }
}
