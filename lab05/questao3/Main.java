package questao3;

public class Main {
    public static void main(String[] args) {
        CentralEstacaoTempo cet = new CentralEstacaoTempo();

        Prefeitura prefeitura = new Prefeitura();
        Aeroporto aeroporto = new Aeroporto();

        cet.registra(prefeitura);
        cet.registra(aeroporto);

        System.out.println("--- Primeira medicao ---");
        cet.novasMedicoes(28.0, 45.0, 30.0);

        System.out.println("\n--- Segunda medicao ---");
        cet.novasMedicoes(34.0, 25.0, 70.0);

        System.out.println("\n--- Aeroporto cancela a inscricao ---");
        cet.remove(aeroporto);

        System.out.println("\n--- Terceira medicao ---");
        cet.novasMedicoes(31.0, 28.0, 80.0);
    }
}
