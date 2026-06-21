package questao2;

public class Espresso extends Bebida {
    public Espresso() {
        descricao = "Espresso";
    }

    @Override
    public double calculaCusto() {
        return 6.0;
    }
}
