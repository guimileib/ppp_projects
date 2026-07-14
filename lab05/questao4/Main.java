package lab05.questao4;

public class Main{
    public static void main(String[] args) {
        Acao acao = new Acao();

        AcaoBroker broker = new AcaoBroker(); // criando o corretor
        Investidor investidor = new Investidor(120, 50, broker, "PETR4", "Guilherme");

        acao.registrar(investidor);
        acao.setPreco(120);
        acao.setPreco(50);
    }
}