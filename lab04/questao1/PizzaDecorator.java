package lab04.questao1;

abstract class PizzaDecorator implements Pizza{
    protected Pizza pizza;

    public PizzaDecorator(Pizza p){
        this.pizza = p;
    }
}
