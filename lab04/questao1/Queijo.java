package questao1;

public class Queijo extends Topping {
    public Queijo(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + ", Queijo";
    }

    @Override
    public double getCusto() {
        return pizza.getCusto() + 4.0;
    }
}
