package questao4;

public class AcaoBroker {
    private String nome;

    public AcaoBroker(String nome) {
        this.nome = nome;
    }

    public void compra(String investidor, String codigoAcao, double preco) {
        System.out.printf("   [Broker %s] Comprando %s para %s a R$ %.2f%n", nome, codigoAcao, investidor, preco);
    }

    public void vende(String investidor, String codigoAcao, double preco) {
        System.out.printf("   [Broker %s] Vendendo %s de %s a R$ %.2f%n", nome, codigoAcao, investidor, preco);
    }
}
