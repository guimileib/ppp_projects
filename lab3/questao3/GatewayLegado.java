public class GatewayLegado {

    public void enviarPagamento(long centavos, String moeda) {
        System.out.println("[GatewayLegado] processando " + centavos
                + " centavos em " + moeda + "... pagamento aprovado.");
    }
}
