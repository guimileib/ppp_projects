package lab04.questao1;

public class Ovo extends PizzaDecorator{

    public Ovo(Pizza p){
        super(p);
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + " + Ovo";
    }

    @Override
    public double getValor() {
        return pizza.getValor() + 3.00;
    }

}
