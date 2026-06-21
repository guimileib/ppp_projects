package questao3;

public class Aeroporto implements Observador {
    @Override
    public void atualiza(double temperatura, double umidade, double rajadaVento) {
        System.out.printf("[Aeroporto] Velocidade das rajadas de vento: %.1f km/h%n", rajadaVento);
        if (rajadaVento > 60) {
            System.out.println("[Torre de Controle] Rajadas fortes, decolagens e pousos suspensos.");
        }
    }
}
