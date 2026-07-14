package lab05.questao1;

public class CartaoPagamento implements PagamentoStrategy{
    @Override
    public void pagar(double valor){
        System.out.println("Pagamento via Cartão no valor de R$" + valor);
    }
}
