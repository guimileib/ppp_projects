package questao2;

public class Decaf extends Bebida {
    public Decaf() {
        descricao = "Descafeinado";
    }

    @Override
    public double calculaCusto() {
        return 5.5;
    }
}
