package Ex2;

public class CafeteiraMain {
    public static void main(String[] args) {
        Bebida cafe = new AdicionalLeite(new Canela(new CafeExpresso()));
        Bebida decaf = new AdicionalLeite(new Chocolate(new Decaf()));
        Bebida leite = new Chocolate(new Leite());
        System.out.println(cafe.getDescricao());
        System.out.println(cafe.calculaPreco());
        System.out.println(decaf.getDescricao());
        System.out.println(decaf.calculaPreco());
        System.out.println(leite.getDescricao());
        System.out.println(leite.calculaPreco());

    }
}
