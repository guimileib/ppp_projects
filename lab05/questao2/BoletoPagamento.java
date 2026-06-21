package questao2;

public class BoletoPagamento implements PagamentoStrategy {
    @Override
    public void paga(double valor) {
        System.out.printf("Boleto gerado no valor de R$ %.2f%n", valor);
        System.out.println("Linha digitavel: 34191.79001 01043.510047 91020.150008 1 9999000000");
    }
}
