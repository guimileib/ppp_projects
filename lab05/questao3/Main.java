package lab05.questao3;

public class Main {
    public static void main(String[] args) {
        CentralEstacaoTempo central = new CentralEstacaoTempo();
        central.registrar(new Prefeitura());
        central.registrar(new Aeroporto());
        central.setMedicoes(12, 12, 34);

        
    }
}
