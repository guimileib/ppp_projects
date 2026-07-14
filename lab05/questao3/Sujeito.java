package lab05.questao3;

public interface Sujeito {
    void registrar(Observador o);
    void remover(Observador o);
    void notificar();
}
