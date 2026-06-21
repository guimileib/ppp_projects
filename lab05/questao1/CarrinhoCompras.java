package questao1;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> itens;
    private PagamentoStrategy pagamentoStrategy;

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

    public void setPagamentoStrategy(PagamentoStrategy pagamentoStrategy) {
        this.pagamentoStrategy = pagamentoStrategy;
    }

    public void realizaPagamento() {
        if (pagamentoStrategy == null) {
            System.out.println("Escolha uma forma de pagamento antes de finalizar a compra.");
            return;
        }
        pagamentoStrategy.paga(calculaTotal());
    }
}
