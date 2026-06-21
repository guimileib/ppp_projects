package questao1;

public class BoletoPagamento implements PagamentoStrategy {
    @Override
    public void paga(double valor) {
        String linhaDigitavel = "34191.79001 01043.510047 91020.150008 1 99990000" + (int) (valor * 100);
        System.out.printf("Boleto gerado no valor de R$ %.2f%n", valor);
        System.out.println("Linha digitavel: " + linhaDigitavel);
    }
}
