package questao2;

public class CartaoPagamento implements PagamentoStrategy {
    private String numero;
    private String titular;

    public CartaoPagamento(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    @Override
    public void paga(double valor) {
        String finalCartao = numero.substring(numero.length() - 4);
        System.out.printf("Pagamento de R$ %.2f realizado no cartao de credito de %s (final %s)%n",
                valor, titular, finalCartao);
    }
}
