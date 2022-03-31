import java.util.Scanner;

public class Sucos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double valor;

        DescontosSucos desc = new DescontosSucos();
        System.out.println("Qual o tipo do suco digite L para Limão ou T para Tamarindo");
        desc.setTipo(scan.next());

        System.out.println("Quantos litros você vendeu?");
        desc.setLitros(scan.nextInt());

        System.out.println("Qual preço do litro?");
        valor = scan.nextDouble();



        System.out.println("o cliente vai pagar com desconto o valor: " + (valor - valor * desc.getLitros() * desc.aplicaDescontos(desc.getTipo(), desc.getLitros())));




    }
}
