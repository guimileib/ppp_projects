package lab03.questao3;

public class LegacyGateway{
    // Adaptee
    public void processPayment(String nomeConta, double value){
        System.out.println("Processando pagamento para " + nomeConta + " no valor: " + "R$" + value);
    }
}
