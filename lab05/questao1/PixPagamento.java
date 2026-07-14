package lab05.questao1;

public class PixPagamento implements PagamentoStrategy{
    @Override
    public void pagar(double valor){
        System.out.println("Pagamento no Pix no valor de R$" + valor);
    }
}
