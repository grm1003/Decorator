package Ex2;

public class Leite implements Bebida{
    @Override
    public String getDescricao() {
    return "Bebida Lactícinia";
    }

    @Override
    public double calculaPreco() {
        return 5;
    }
}
