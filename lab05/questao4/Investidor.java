package lab05.questao4;

public class Investidor implements Observador {
    private double precoMax;
    private double precoMin;
    private AcaoBroker acaoBroker;
    private String nomeAcao;
    private String nomeInvestidor;

    // contrutor investidor
    public Investidor(double precoMax, double precoMin, 
        AcaoBroker acaoBroker, String nomeAcao, String nomeInvestidor){
            this.precoMax = precoMax;
            this.precoMin = precoMin;
            this.acaoBroker = acaoBroker;
            this.nomeAcao = nomeAcao;
            this.nomeInvestidor = nomeInvestidor;
        }


    @Override
    public void atualizar(double preco) {
        if (preco >= precoMax ){
            acaoBroker.venderAcao(nomeAcao);
        } else if( preco <= precoMin){
            acaoBroker.comprarAcao(nomeAcao);
        }
    }
    
}
