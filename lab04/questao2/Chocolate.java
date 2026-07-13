package lab04.questao2;

public class Chocolate extends CafeteriaDecorator {

    public Chocolate(Bebida cafe) {
        super(cafe);
    }

    @Override
    public double calculaCusto() {
        return cafe.calculaCusto() + 3.50;
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + " + Chocolate";
    }
    
}
