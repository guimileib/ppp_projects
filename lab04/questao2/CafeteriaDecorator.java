package lab04.questao2;

abstract class CafeteriaDecorator implements Bebida{
    protected Bebida cafe;

    public CafeteriaDecorator(Bebida cafe){
        this.cafe = cafe;
    }
}
