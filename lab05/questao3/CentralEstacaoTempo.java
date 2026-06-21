package questao3;

import java.util.ArrayList;
import java.util.List;

public class CentralEstacaoTempo implements Sujeito {
    private List<Observador> observadores;
    private double temperatura;
    private double umidade;
    private double rajadaVento;

    public CentralEstacaoTempo() {
        observadores = new ArrayList<>();
    }

    @Override
    public void registra(Observador o) {
        observadores.add(o);
    }

    @Override
    public void remove(Observador o) {
        observadores.remove(o);
    }

    @Override
    public void notifica() {
        for (Observador o : observadores) {
            o.atualiza(temperatura, umidade, rajadaVento);
        }
    }

    public void novasMedicoes(double temperatura, double umidade, double rajadaVento) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.rajadaVento = rajadaVento;
        notifica();
    }
}
