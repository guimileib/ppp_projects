package questao2;

public class Chocolate extends Adicional {
    public Chocolate(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " com Chocolate";
    }

    @Override
    public double calculaCusto() {
        return bebida.calculaCusto() + 2.0;
    }
}
