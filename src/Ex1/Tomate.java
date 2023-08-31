package Ex1;

public class Tomate extends ToppingDecorator{
    public Tomate(Pizza pizza) {
        super(pizza);
    }
    @Override
    public String getDescricao() {
        return pizza.getDescricao() + " com tomate";
    }

    @Override
    public double custo() {
        return pizza.custo() + 6;
    }
}
