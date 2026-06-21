package questao2;

public class PixPagamento implements PagamentoStrategy {
    private String chave;

    public PixPagamento(String chave) {
        this.chave = chave;
    }

    @Override
    public void paga(double valor) {
        System.out.printf("Pagamento de R$ %.2f realizado via Pix (chave: %s)%n", valor, chave);
    }
}
