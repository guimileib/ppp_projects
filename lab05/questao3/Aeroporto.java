package lab05.questao3;

public class Aeroporto implements Observador {

    @Override
    public void atualizar(double temperatura, double umidade, double vento) {
       System.out.println("Aeroporto avisa, as rajadas de vento hoje estão á " + vento + " km por hora.");
    }
    
}
