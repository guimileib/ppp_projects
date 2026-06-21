package questao2;

public class FreteNormal implements FreteStrategy {
    @Override
    public double calcula(double pesoTotal) {
        return 10.0 + pesoTotal * 1.5;
    }

    @Override
    public String getNome() {
        return "Normal";
    }
}
