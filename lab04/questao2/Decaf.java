package lab04.questao2;
//base decorador
public class Decaf implements Bebida {
    @Override
    public double calculaCusto() {
        return 5.00;
    }

    @Override
    public String getDescricao() {
        return "Café Descafeínado";
    }
    
}
