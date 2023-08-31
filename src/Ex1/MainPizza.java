package Ex1;

public class MainPizza {
    public static void main(String[] args) {
        Pizza Marguerita = new Queijo(new Tomate(new MassaFina()));
        System.out.println(Marguerita.custo());
        System.out.println(Marguerita.getDescricao());
        Pizza Portuguesa = new Ovos(new Queijo(new Tomate(new MassaEspessa())));
        System.out.println(Portuguesa.custo());
        System.out.println(Portuguesa.getDescricao());

    }
}
