package lab05.questao1;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> itens = new ArrayList<>();

    public void adicionaItem(Item item){
        itens.add(item);
    }

    public void removeItem(Item item){
        itens.remove(item);
    }

    public double calculaTotal(){
        double total = 0;
        for (Item item : itens){
            total += item.getPreco();
        }
        return total;
    }
    
    public void realizaPagamento(PagamentoStrategy estrategia){
        estrategia.pagar(calculaTotal());
    }
}
