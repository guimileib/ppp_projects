package lab04.questao1;

public class Tomate extends PizzaDecorator{

    public Tomate(Pizza p){
        super(p);
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + " + Tomate"; 
    }

    @Override
    public double getValor() {
        return pizza.getValor() + 1.50;
    }
    
}
