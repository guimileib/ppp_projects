package lab05.questao4;

public interface Sujeito {
    public void registrar(Observador observador);
    public void remover(Observador observador);
    public void notificar();
}
