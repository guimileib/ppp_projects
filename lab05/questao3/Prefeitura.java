package questao3;

public class Prefeitura implements Observador {
    @Override
    public void atualiza(double temperatura, double umidade, double rajadaVento) {
        System.out.printf("[Prefeitura] Umidade relativa do ar: %.1f%%%n", umidade);
        if (umidade < 20) {
            System.out.println("[Defesa Civil] ALERTA DE EMERGENCIA: umidade em estado critico.");
        } else if (umidade < 30) {
            System.out.println("[Defesa Civil] ALERTA: umidade muito baixa, hidrate-se e evite atividades fisicas ao ar livre.");
        }
    }
}
