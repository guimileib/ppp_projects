package questao2;

public class PedidoNaLoja extends Pedido {

    @Override
    protected void processarPagamento(double total) {
        System.out.printf("Pagamento de R$ %.2f efetuado no caixa da loja.%n", total);
    }

    @Override
    protected boolean temEntrega() {
        return false;
    }
}
