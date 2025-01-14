import java.util.Scanner;
public class Questao18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe uma data no formato dd/mm/aaaa");
        String data = sc.nextLine();
        
        String [] partes = data.split("/");

        if(partes.length != 3){
            System.out.println("Formato invalido. Uso o formate dd/mm/aaaa");
            sc.close();
        }

        try{
            int dia = Integer.parseInt(partes[0]);
            int mes = Integer.parseInt(partes[1]);
            int ano = Integer.parseInt(partes[2]);

            if (dataValida(dia, mes, ano)) {
                System.out.println("oi");
            }
        }

        public static boolean dataValida(int dia, int mes, int ano){
            if (mes < 1 || mes > 12){
                return false;
            }

            int[] diaPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}

            if(mes == 2 && anoBissexto(ano)){
                diaPorMes [1] = 29;
            }
            return dia > 0 && dia <= diasPorMes[mes -1];
        }
    }
}
