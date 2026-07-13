package lab04.questao4;

public class Porta {
    private boolean estadoPorta;

    public void fecharPorta(){
        System.out.println("Fechando porta");
        setEstadoPorta(false);
    }

    public void abrirPorta(){
        System.out.println("Abrindo porta");
        setEstadoPorta(true);
    }

    public boolean isEstadoPorta() {
        return estadoPorta;
    }

    public void setEstadoPorta(boolean estadoPorta) {
        this.estadoPorta = estadoPorta;
    }
}
