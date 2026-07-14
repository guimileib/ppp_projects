package lab05.questao1;

public class BoletoPagamento implements PagamentoStrategy{

    @Override
    public void pagar(double valor){
        System.out.println("Pagamento via boleto no valor de R$" + valor);
    }
}
