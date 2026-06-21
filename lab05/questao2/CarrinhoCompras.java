package questao2;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> itens;
    private PagamentoStrategy pagamentoStrategy;
    private FreteStrategy freteStrategy;

    public CarrinhoCompras() {
        itens = new ArrayList<>();
    }

    public void adicionaItem(Item item) {
        itens.add(item);
    }

    public void removeItem(Item item) {
        itens.remove(item);
    }

    public double calculaTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }

    private double calculaPesoTotal() {
        double peso = 0;
        for (Item item : itens) {
            peso += item.getPeso() * item.getQuantidade();
        }
        return peso;
    }

    public double calculaFrete() {
        if (freteStrategy == null) {
            return 0;
        }
        return freteStrategy.calcula(calculaPesoTotal());
    }

    public void setPagamentoStrategy(PagamentoStrategy pagamentoStrategy) {
        this.pagamentoStrategy = pagamentoStrategy;
    }

    public void setFreteStrategy(FreteStrategy freteStrategy) {
        this.freteStrategy = freteStrategy;
    }

    public void realizaPagamento() {
        if (pagamentoStrategy == null) {
            System.out.println("Escolha uma forma de pagamento antes de finalizar a compra.");
            return;
        }
        double frete = calculaFrete();
        double total = calculaTotal() + frete;
        if (freteStrategy != null) {
            System.out.printf("Frete (%s): R$ %.2f%n", freteStrategy.getNome(), frete);
        }
        pagamentoStrategy.paga(total);
    }
}
