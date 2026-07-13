package lab04.questao2;

public class Main {
    public static void main(String[] args) {
        Bebida espressoChocLeite = new Chocolate(new Leite(new Espresso()));

        System.out.println("Bebida Pedido:");
        System.out.println("Descrição: " + espressoChocLeite.getDescricao());
        System.out.println("Valor: " + espressoChocLeite.calculaCusto());

    }
}
