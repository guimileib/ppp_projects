package questao2;

public class Leite extends Adicional {
    public Leite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " com Leite";
    }

    @Override
    public double calculaCusto() {
        return bebida.calculaCusto() + 1.5;
    }
}
