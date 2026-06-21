package questao3;

public interface Sujeito {
    void registra(Observador o);

    void remove(Observador o);

    void notifica();
}
