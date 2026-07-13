package lab03.questao4;

public class CatalagoSearch implements InterfaceCatalagoSearch {
    
    @Override
    public CatalagoPizzaria getCatalagoPizzaria(String unidadePizzaria){
        System.out.println("Pegando em banco o catalago da Pizzaria unidade: " + unidadePizzaria);
        return new CatalagoPizzaria(unidadePizzaria);
    }
}
