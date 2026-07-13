package lab04.questao2;

public class Canela extends CafeteriaDecorator{
    public Canela(Bebida c){
        super(c);
    }

    @Override
    public double calculaCusto() {
        return cafe.calculaCusto() + 3.00;
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + " + Canela";
    }


    
}
