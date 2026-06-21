package questao1;

public class Cebola extends Topping {
    public Cebola(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + ", Cebola";
    }

    @Override
    public double getCusto() {
        return pizza.getCusto() + 2.0;
    }
}
