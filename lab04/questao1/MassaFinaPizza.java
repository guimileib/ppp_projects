package questao1;

public class MassaFinaPizza extends Pizza {
    public MassaFinaPizza() {
        descricao = "Massa Fina";
    }

    @Override
    public double getCusto() {
        return 15.0;
    }
}
