package questao2;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Pedido Online ===");
        new PedidoOnline().processarPedido(3, 49.90);

        System.out.println("\n=== Pedido na Loja ===");
        new PedidoNaLoja().processarPedido(2, 15.00);

        System.out.println("\n=== Pedido via Criptomoedas ===");
        new PedidoCriptomoedas().processarPedido(1, 1200.00);
    }
}
