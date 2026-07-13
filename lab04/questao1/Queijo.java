package lab04.questao1;

public class Queijo extends PizzaDecorator{
    
    public Queijo(Pizza p){
        super(p); // chama o atributo da classe mãe
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + " + Queijo";
    }

    @Override
    public double getValor() {
        return pizza.getValor() + 2.00; 
    }
}
