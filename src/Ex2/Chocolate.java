package Ex2;

public class Chocolate extends BebidaDecorator{
    public Chocolate(Bebida bebida) {
        super(bebida);
    }
    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " com chocolate";
    }

    @Override
    public double calculaPreco() {
        return bebida.calculaPreco() + 2;
    }
}
