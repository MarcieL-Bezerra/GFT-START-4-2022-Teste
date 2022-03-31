import java.util.Scanner;

public class TurnoTrabalhado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String turno;
        System.out.println("Olá, Em qual turno Você trabalha");
        System.out.println("Para Matutino digite a letra M para a Vespertino digite V para a Noturno digite N ");
        turno = scan.next();

        if (turno.equalsIgnoreCase("M")){
            System.out.println("Bom dia");
        }else if (turno.equalsIgnoreCase("V")) {
            System.out.println("Boa Tarde");
        }else if (turno.equalsIgnoreCase("N")) {
            System.out.println("Boa Noite");
        }else {
            System.out.println("Valor inválido");
        }

    }

}
