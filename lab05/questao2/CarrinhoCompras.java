package lab05.questao2;

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
    
    public void calculaFrete(FreteStrategy frete){
        System.out.println("Frete no valor de R$" + frete.calcular());
    }

    public void realizaPagamento(PagamentoStrategy estrategia){
        estrategia.pagar(calculaTotal());
    }
}
