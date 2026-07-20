package lab06.questao2;

public abstract class Pedido {
    public final void processarPedido(int qntItens, double valorItem){
        double total = calcularTotal(qntItens, valorItem);
        processarPagamento(total);
        decidirEntrega();
    }

    private double calcularTotal(int qntItens, double valorItem){
        double total = qntItens * valorItem;
        System.out.printf("Total do pedido: R$ %.2f", total);
        return total;
    }

    // abstratos variam
    protected abstract void processarPagamento(double total);
    protected abstract void decidirEntrega();
}
