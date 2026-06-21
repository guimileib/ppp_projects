package questao1;

public abstract class Topping extends Pizza {
    protected Pizza pizza;

    public Topping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public abstract String getDescricao();
}
