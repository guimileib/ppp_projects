public class GatewayAdapter implements MeioDePagamento {

    private final GatewayLegado gateway;

    public GatewayAdapter(GatewayLegado gateway) {
        this.gateway = gateway;
    }

    @Override
    public void pagar(double valorEmReais) {
        long centavos = Math.round(valorEmReais * 100);
        gateway.enviarPagamento(centavos, "BRL");
    }
}
