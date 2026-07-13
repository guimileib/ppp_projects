package lab03.questao3;

public class MidllewarePagamento implements GatewayPagamento{
    private LegacyGateway legacyGateway;

    public MidllewarePagamento(LegacyGateway legacyGateway){
        this.legacyGateway = legacyGateway;
    }

    // Adapter
    @Override
    public void processarPagamento(String idTransacao, int numeroConta, int valor){
        String nomeConta = "Conta" + numeroConta;
        double value = valor;
        legacyGateway.processPayment(nomeConta, value);
    }
}
