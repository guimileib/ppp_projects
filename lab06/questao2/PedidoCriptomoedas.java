package questao2;

public class PedidoCriptomoedas extends Pedido {

    @Override
    protected void processarPagamento(double total) {
        System.out.printf("Pagamento de R$ %.2f convertido e pago em criptomoedas (BTC).%n", total);
    }

    @Override
    protected boolean temEntrega() {
        return true;
    }

    @Override
    protected void realizarEntrega() {
        System.out.println("Entrega realizada com rastreamento registrado em blockchain.");
    }
}
