package lab04.questao4;

public class CintoSeguranca {
    private boolean cinto;

    public void travarCinto(){
        System.out.println("Cinto travado");
        cinto = true;
    } 

    public void tirarCinto(){
        System.out.println("Tirando cinto.");
        cinto = false;
    }

    public boolean isCinto() {
        return cinto;
    }

    public void setCinto(boolean cinto) {
        this.cinto = cinto;
    }
}
