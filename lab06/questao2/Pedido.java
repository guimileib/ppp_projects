package questao2;

public abstract class Pedido {

    // template method
    public final void processarPedido(int quantidade, double valorItem) {
        double total = calcularTotal(quantidade, valorItem);
        System.out.printf("Total: %d item(ns) x R$ %.2f = R$ %.2f%n",
                quantidade, valorItem, total);

        processarPagamento(total); // abstrato

        if (temEntrega()) { // abstrato
            realizarEntrega();
        } else {
            System.out.println("Sem entrega: retirada no local.");
        }
        System.out.println("Pedido concluído.");
    }

    // metodo concreto
    private double calcularTotal(int quantidade, double valorItem) {
        return quantidade * valorItem;
    }

    // metodos abstratos
    protected abstract void processarPagamento(double total);
    protected abstract boolean temEntrega();

    // metodo concreto (pode ser sobrescrito)
    protected void realizarEntrega() {
        System.out.println("Entrega realizada no endereço cadastrado.");
    }
}
