package lab03.questao4;

public class Main {
    public static void main(String[] args) {

        //quem vai no banco objeto
        CatalagoSearch buscaReal = new CatalagoSearch();

        // cliente conversa com a interface
        InterfaceCatalagoSearch busca = new PizzariaSearchProxy(buscaReal);

        System.out.println("1a busca (Centro):");
        busca.getCatalagoPizzaria("Centro");     // vai no banco

        System.out.println("\n2a busca (Centro) de novo:");
        busca.getCatalagoPizzaria("Centro");    // vai vir do cache

        System.out.println("\nBusca nova (Shopping):");
        busca.getCatalagoPizzaria("Shopping");   //nova vai no banco
    }
}
