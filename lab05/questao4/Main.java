package questao4;

public class Main {
    public static void main(String[] args) {
        AcaoBroker brokerXP = new AcaoBroker("XP");
        AcaoBroker brokerRico = new AcaoBroker("Rico");

        Acao petr4 = new Acao("PETR4", 30.0);

        Investidor joao = new Investidor("Joao", 25.0, 35.0, brokerXP);
        Investidor maria = new Investidor("Maria", 28.0, 40.0, brokerRico);

        petr4.registra(joao);
        petr4.registra(maria);

        petr4.setPreco(33.0);
        petr4.setPreco(36.0);
        petr4.setPreco(24.0);
        petr4.setPreco(41.0);
    }
}
