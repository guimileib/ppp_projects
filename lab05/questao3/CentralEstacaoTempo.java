package lab05.questao3;

import java.util.ArrayList;
import java.util.List;

public class CentralEstacaoTempo implements Sujeito {
    private List<Observador> observadores = new ArrayList<>();
    private double temperatura, umidade, vento; // atributos da classe

    // instancia central e cria um novo observador 
    @Override
    public void registrar(Observador o) {
       observadores.add(o);
    }

    // pode remover tbm
    @Override
    public void remover(Observador o) {
        observadores.remove(o);
    }

    // notificar todos concentra a mensagem aqui
    @Override
    public void notificar() {
       for (Observador observador : observadores){
            observador.atualizar(temperatura, umidade, vento);
       }
    }

    // novas medições 
    public void setMedicoes(double temperatura, double umidade, double vento) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.vento = vento;
        notificar();  
    }

    
}
