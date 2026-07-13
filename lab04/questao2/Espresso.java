package lab04.questao2;
// base decorador
public class Espresso implements Bebida{

    @Override
    public double calculaCusto() {
        return 6.50;
    }

    @Override
    public String getDescricao() {
        return "Café Expresso";
    }
    
}
