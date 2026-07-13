package lab03.questao3;

public interface GatewayPagamento{
    void processarPagamento(String idTransacao, int numeroConta, int valor);
}