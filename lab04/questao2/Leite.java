package lab04.questao2;

public class Leite extends CafeteriaDecorator{

    public Leite(Bebida c){
        super(c);
    }

    @Override
    public double calculaCusto() {
        return cafe.calculaCusto() + 2.00;
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + " + Leite";
    }
    
}
