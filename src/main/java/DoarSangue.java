import java.util.Scanner;

public class DoarSangue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade;
        System.out.println("Qual sua idade");
        idade = scan.nextInt();

        if (idade<18 || idade> 67){
            System.out.println("Você não pode doar sangue");

        }else {
            System.out.println("Você pode doar sangue");
        }

    }
}
