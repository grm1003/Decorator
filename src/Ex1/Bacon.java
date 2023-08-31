package Ex1;

public class Bacon extends ToppingDecorator{
    public Bacon(Pizza pizza) {
        super(pizza);
    }
    @Override
    public String getDescricao() {
        return pizza.getDescricao() + " com bacon";
    }

    @Override
    public double custo() {
        return pizza.custo() + 4;
    }
}
