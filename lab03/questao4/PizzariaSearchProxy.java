package lab03.questao4;

import java.util.HashMap;
import java.util.Map;

public class PizzariaSearchProxy implements InterfaceCatalagoSearch {
    private CatalagoSearch catalagoSearch;
    private Map<String, CatalagoPizzaria> cache = new HashMap<>();

    public PizzariaSearchProxy(CatalagoSearch cs) {
        this.catalagoSearch = cs;
    }

    // Se ja esta no cache, devolve. Senão, busca no real e guarda no cache
    @Override
    public CatalagoPizzaria getCatalagoPizzaria(String unidadePizzaria){
        if(cache.containsKey(unidadePizzaria)){
            return cache.get(unidadePizzaria);
        }
        CatalagoPizzaria catalagoPizzaria = catalagoSearch.getCatalagoPizzaria(unidadePizzaria);
        cache.put(unidadePizzaria, catalagoPizzaria);
        return catalagoPizzaria;
    }

}
