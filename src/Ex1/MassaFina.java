package Ex1;

public class MassaFina implements Pizza{
    @Override
    public String getDescricao() {
        return "Pizza de Massa Fina";
    }

    @Override
    public double custo() {
        return 25;
    }
}
