package lab04.questao4;

public class Farol {
    private boolean farol;

    public void ligarFarol(){
        System.out.println("Ligando Farol ...");
        farol = true;
    }

    public void desligarFarol(){
        System.out.println("Desligando Farol");
        farol = false;
    }

    public boolean isFarol() {
        return farol;
    }

    public void setFarol(boolean farol) {
        this.farol = farol;
    }
}
