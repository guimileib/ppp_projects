package lab05.questao4;

import java.util.ArrayList;
import java.util.List;

public class Acao implements Sujeito {
    private List<Observador> observadores = new ArrayList<>();
    private String nome;
    private double preco;

    @Override
    public void registrar(Observador observador) {
       observadores.add(observador);
    }

    @Override
    public void remover(Observador observador) {
       observadores.remove(observador);
    }

    @Override
    public void notificar() {
        for(Observador observador : observadores){
            observador.atualizar(preco);
        }
    }

    public void setPreco(double preco){
        this.preco = preco;
        notificar();
    }
    
}
