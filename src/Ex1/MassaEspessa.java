package Ex1;

public class MassaEspessa implements Pizza{

    @Override
    public String getDescricao() {
        return "Pizza de Massa Espessa";
    }

    @Override
    public double custo() {
        return 32;
    }
}
