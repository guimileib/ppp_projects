package lab03.questao3;

public class Main{
    public static void main(String[] args) {
        LegacyGateway legacy = new LegacyGateway();
        System.out.println("Pagamento Legado:");
        legacy.processPayment("Guilherme", 120);

        MidllewarePagamento pagamento = new MidllewarePagamento(legacy);
        System.out.println("\nPagamento via Adapter:");
        pagamento.processarPagamento("udha1234", 1345, 120);
    
    }   

}