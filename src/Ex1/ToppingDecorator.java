package Ex1;

public class ToppingDecorator implements Pizza {

    protected Pizza pizza;

    public ToppingDecorator(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao();
    }

    @Override
    public double custo() {
        return pizza.custo();
    }
}
