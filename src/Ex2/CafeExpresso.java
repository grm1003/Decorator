package Ex2;

public class CafeExpresso implements Bebida{
    @Override
    public String getDescricao() {
        return "Bebida Cafeinaida";
    }

    @Override
    public double calculaPreco() {
        return 2.5;
    }
}
