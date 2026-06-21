package questao2;

public class ChantilLy extends Adicional {
    public ChantilLy(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " com Chantilly";
    }

    @Override
    public double calculaCusto() {
        return bebida.calculaCusto() + 1.25;
    }
}
