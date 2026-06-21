package questao1;

public class Tomate extends Topping {
    public Tomate(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + ", Tomate";
    }

    @Override
    public double getCusto() {
        return pizza.getCusto() + 2.5;
    }
}
