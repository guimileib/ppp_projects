package questao1;

public class Main {
    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();
        carrinho.adicionaItem(new Item("Teclado Mecanico", 250.0, 1));
        carrinho.adicionaItem(new Item("Mouse Gamer", 150.0, 2));
        carrinho.adicionaItem(new Item("Mousepad", 40.0, 1));

        System.out.printf("Total do carrinho: R$ %.2f%n%n", carrinho.calculaTotal());

        carrinho.setPagamentoStrategy(new PixPagamento("guilherme@email.com"));
        carrinho.realizaPagamento();

        System.out.println();

        carrinho.setPagamentoStrategy(new CartaoPagamento("1234567890121234", "Guilherme Leib"));
        carrinho.realizaPagamento();

        System.out.println();

        carrinho.setPagamentoStrategy(new BoletoPagamento());
        carrinho.realizaPagamento();
    }
}
