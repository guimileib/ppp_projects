package lab04.questao3;

public class Luzes {
    private boolean apagador;

    public void ligarLuzes(){
        System.out.println("Ligando luzes...");
        setApagador(true);
    }

    public void apagarLuzes(){
        System.out.println("Apagando ");
    }

    public boolean isApagador() {
        return apagador;
    }

    public void setApagador(boolean apagador) {
        this.apagador = apagador;
    }
}
