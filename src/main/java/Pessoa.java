import java.util.Calendar;
import java.util.GregorianCalendar;

public class Pessoa {
    private String nome;
    private String DataNascimento;
    private Double altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        DataNascimento = dataNascimento;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    public void dadosPessoa(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Data de Nascimento: " + this.getDataNascimento());
    }

    public int calculaIdade(String dt_nasc) {

        // Data de hoje.
        GregorianCalendar hoje = new GregorianCalendar();
        int diah = hoje.get(Calendar.DAY_OF_MONTH);
        int mesh = hoje.get(Calendar.MONTH) + 1;
        int anoh = hoje.get(Calendar.YEAR);

        // Data do nascimento.
        int dian = Integer.valueOf(dt_nasc.substring(0,2));
        int mesn = Integer.valueOf(dt_nasc.substring(3,5));
        int anon = Integer.valueOf(dt_nasc.substring(6,10));

        // Idade.
        int idade;

        if (mesn < mesh || (mesn == mesh && dian <= diah))
            idade = anoh - anon;
        else
            idade = (anoh - anon)-1;

        return (idade);
    }
}
