package lab06.questao2;

public class PedidoCripto extends Pedido {
    private boolean entrega;

    public PedidoCripto(boolean entrega){
        this.entrega = entrega;
    }

    @Override
    protected void processarPagamento(double total) {
        System.out.printf("\nProcessando pagamento via criptomoedas no total de R$ %.2f ", total);
    }

    @Override
    protected void decidirEntrega() {
       if (entrega == true){
            System.out.println("\nVamos entregar sua encomenda em casa!");
       } else{
            System.out.println("\nSem entrega");
       }
    }
    
}
