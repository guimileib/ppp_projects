package questao2;

public class PedidoOnline extends Pedido {

    @Override
    protected void processarPagamento(double total) {
        System.out.printf("Pagamento de R$ %.2f processado online via cartão de crédito.%n", total);
    }

    @Override
    protected boolean temEntrega() {
        return true;
    }
}
