package Ex1;

public class Queijo extends ToppingDecorator{
    public Queijo(Pizza pizza) {
        super(pizza);
    }
    @Override
    public String getDescricao() {
        return pizza.getDescricao() + " com queijo";
    }

    @Override
    public double custo() {
        return pizza.custo() + 10;
    }
}
