public class DescontosSucos {
    private int litros;
    private double descontos;
    private String tipo;
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }


    public double getDescontos() {
        return descontos;
    }

    public double aplicaDescontos(String tipo, int litro) {
        if (tipo.equalsIgnoreCase("l") && litro <=2){
            this.descontos = 0.03;
        }else if (tipo.equalsIgnoreCase("l") && litro >5){
            this.descontos = 0.05;
        }else if (tipo.equalsIgnoreCase("t") && litro <=2){
            this.descontos = 0.04;
        }else if (tipo.equalsIgnoreCase("t") && litro >5){
            this.descontos = 0.06;
        }

        return this.descontos;
    }
}
