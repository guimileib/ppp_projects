package lab06.questao2;

public class PedidoLoja extends Pedido {
    private boolean entrega;

    public PedidoLoja(boolean entrega){
        this.entrega = entrega;
    }

    @Override
    protected void processarPagamento(double total) {
        System.out.printf("\nProcessando pagamento no dinheiro/cartão no total de R$ %.2f", total);
    }

    @Override
    protected void decidirEntrega() {
       if (entrega == true){
            System.out.println("\nVamos entregar sua encomenda em casa!");
       } else{
            System.out.println("\nSem entrega.");
       }
    }
    
}
