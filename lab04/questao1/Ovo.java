package questao1;

public class Ovo extends Topping {
    public Ovo(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + ", Ovo";
    }

    @Override
    public double getCusto() {
        return pizza.getCusto() + 3.0;
    }
}
