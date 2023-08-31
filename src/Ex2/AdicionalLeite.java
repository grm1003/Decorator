package Ex2;

public class AdicionalLeite extends BebidaDecorator{
    public AdicionalLeite(Bebida bebida) {
        super(bebida);
    }
    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " com leite";
    }

    @Override
    public double calculaPreco() {
        return bebida.calculaPreco() + 1.5;
    }
}
