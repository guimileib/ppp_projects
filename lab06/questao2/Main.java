package lab06.questao2;

public class Main {
    public static void main(String[] args) {
        PedidoLoja pL = new PedidoLoja(true);
        
        System.out.println("");
        pL.processarPedido(3, 23.90);
        
        System.out.println("");
        PedidoCripto pC = new PedidoCripto(false);
        pC.processarPedido(3,67.90);

        System.out.println("");
        PedidoOnline pO = new PedidoOnline(true);
        pO.processarPedido(3,67.90);
    }
}
