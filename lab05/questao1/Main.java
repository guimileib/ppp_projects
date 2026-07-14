package lab05.questao1;

public class Main{
    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();
        carrinho.adicionaItem(new Item("Teclado", 150));
        carrinho.adicionaItem(new Item("Mouse", 110));

        System.out.println("Total: R$"+carrinho.calculaTotal());

        carrinho.realizaPagamento(new CartaoPagamento());
    }
}