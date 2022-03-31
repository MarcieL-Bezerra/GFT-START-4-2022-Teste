import java.util.Date;
public class AppPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        p1.setNome("Marciel Bezerra");
        p1.setAltura(1.70);
        p1.setDataNascimento("02/12/1984");

        p1.dadosPessoa();
        System.out.println("Idade: " + p1.calculaIdade(p1.getDataNascimento()) + " Anos! ");
    }
}
