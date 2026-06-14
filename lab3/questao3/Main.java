public class Main {

    public static void main(String[] args) {

        MeioDePagamento pagamento = new GatewayAdapter(new GatewayLegado());

        System.out.println("Finalizando compra...");
        pagamento.pagar(149.90);
        pagamento.pagar(9.99);
    }
}
