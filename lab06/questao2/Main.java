package lab06.questao2;
// A diferença do Template para Decorator:
// Template: é usada herança subclasse sobrescreve passos, 
// fixa um esqueleto e varia os passos.
// Decorator: embrulha a estrutura empilha o comportamento a uma base.

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
