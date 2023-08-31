package Ex2;

public class Decaf implements Bebida{
    @Override
    public String getDescricao() {
        return "Bebida Descafeinaida";
    }

    @Override
    public double calculaPreco() {
        return 4;
    }
}
