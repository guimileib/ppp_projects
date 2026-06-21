package questao2;

public class Main {
    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();
        carrinho.adicionaItem(new Item("Teclado Mecanico", 250.0, 1, 1.2));
        carrinho.adicionaItem(new Item("Mouse Gamer", 150.0, 2, 0.3));
        carrinho.adicionaItem(new Item("Monitor 24", 900.0, 1, 4.5));

        System.out.printf("Total dos produtos: R$ %.2f%n%n", carrinho.calculaTotal());

        carrinho.setFreteStrategy(new FreteSedex());
        System.out.printf("Frete Sedex: R$ %.2f%n", carrinho.calculaFrete());

        carrinho.setFreteStrategy(new FreteNormal());
        System.out.printf("Frete Normal: R$ %.2f%n%n", carrinho.calculaFrete());

        carrinho.setFreteStrategy(new FreteSedex());
        carrinho.setPagamentoStrategy(new PixPagamento("guilherme@email.com"));
        carrinho.realizaPagamento();

        System.out.println();

        carrinho.setFreteStrategy(new FreteNormal());
        carrinho.setPagamentoStrategy(new CartaoPagamento("1234567890121234", "Guilherme Leib"));
        carrinho.realizaPagamento();
    }
}
