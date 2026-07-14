package lab05.questao2;

public class BoletoPagamento implements PagamentoStrategy{

    @Override
    public void pagar(double valor){
        System.out.println("Pagamento via boleto no valor de R$" + valor);
    }
}
