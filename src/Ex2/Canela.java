package Ex2;

public class Canela extends BebidaDecorator{
    public Canela(Bebida bebida) {
        super(bebida);
    }
    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " com canela";
    }

    @Override
    public double calculaPreco() {
        return bebida.calculaPreco() + 0.5;
    }
}
