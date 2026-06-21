package questao2;

public class Cafeteria {
    public static void main(String[] args) {
        Bebida bebida1 = new Espresso();
        bebida1 = new Leite(bebida1);
        bebida1 = new Chocolate(bebida1);
        System.out.println(bebida1.getDescricao());
        System.out.printf("Custo: R$ %.2f%n%n", bebida1.calculaCusto());

        Bebida bebida2 = new Decaf();
        bebida2 = new Leite(bebida2);
        bebida2 = new Canela(bebida2);
        System.out.println(bebida2.getDescricao());
        System.out.printf("Custo: R$ %.2f%n%n", bebida2.calculaCusto());

        Bebida bebida3 = new Espresso();
        bebida3 = new Chocolate(bebida3);
        bebida3 = new ChantilLy(bebida3);
        bebida3 = new Canela(bebida3);
        System.out.println(bebida3.getDescricao());
        System.out.printf("Custo: R$ %.2f%n", bebida3.calculaCusto());
    }
}
