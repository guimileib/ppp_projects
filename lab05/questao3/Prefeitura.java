package lab05.questao3;

public class Prefeitura implements Observador{

    @Override
    public void atualizar(double temperatura, double umidade, double vento) {
        if (40 <= umidade && umidade <= 60){
            System.out.println("Defesa civil avisa, umidade do ar está dentro dos padrões normais.");
        } else {
            System.out.println("Defesa civil avisa, umidade do ar está fora dos limites.");
        }
    }
    
}
