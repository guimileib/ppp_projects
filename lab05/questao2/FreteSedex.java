package questao2;

public class FreteSedex implements FreteStrategy {
    @Override
    public double calcula(double pesoTotal) {
        return 20.0 + pesoTotal * 3.5;
    }

    @Override
    public String getNome() {
        return "Sedex";
    }
}
