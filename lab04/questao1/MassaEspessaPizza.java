package questao1;

public class MassaEspessaPizza extends Pizza {
    public MassaEspessaPizza() {
        descricao = "Massa Espessa";
    }

    @Override
    public double getCusto() {
        return 18.0;
    }
}
