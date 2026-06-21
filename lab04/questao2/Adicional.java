package questao2;

public abstract class Adicional extends Bebida {
    protected Bebida bebida;

    public Adicional(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public abstract String getDescricao();
}
