package lab03.questao4;

public class CatalagoSearch implements InterfaceCatalagoSearch {
    
    @Override
    public CatalagoPizzaria getCatalagoPizzaria(String unidadePizzaria){
        return new CatalagoPizzaria(unidadePizzaria);
    }
}
