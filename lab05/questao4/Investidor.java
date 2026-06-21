package questao4;

public class Investidor implements Observador {
    private String nome;
    private double limiteMinimo;
    private double limiteMaximo;
    private AcaoBroker broker;

    public Investidor(String nome, double limiteMinimo, double limiteMaximo, AcaoBroker broker) {
        this.nome = nome;
        this.limiteMinimo = limiteMinimo;
        this.limiteMaximo = limiteMaximo;
        this.broker = broker;
    }

    @Override
    public void atualiza(String codigoAcao, double preco) {
        System.out.printf("   %s observou %s a R$ %.2f (limites: %.2f - %.2f)%n",
                nome, codigoAcao, preco, limiteMinimo, limiteMaximo);
        if (preco >= limiteMaximo) {
            broker.vende(nome, codigoAcao, preco);
        } else if (preco <= limiteMinimo) {
            broker.compra(nome, codigoAcao, preco);
        }
    }

    public String getNome() {
        return nome;
    }
}
