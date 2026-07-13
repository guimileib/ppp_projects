package lab04.questao4;

public class Motor {
    private boolean motor;

    public void ligarCarro(){
        System.out.println("Ligando carro");
        setMotor(true);
    }

    public void desligarCarro(){
        System.out.println("Desligando carro");
        setMotor(false);
    }

    public boolean isMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }
}
