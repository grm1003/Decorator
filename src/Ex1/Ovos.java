package Ex1;

public class Ovos extends ToppingDecorator{
    public Ovos(Pizza pizza) {
        super(pizza);
    }
    @Override
    public String getDescricao() {
        return pizza.getDescricao() + " com ovos";
    }

    @Override
    public double custo() {
        return pizza.custo() + 4;
    }
}
