package lab02.questao2;

public class Corolla implements IVehicle{
    @Override
    public void start(){
        System.out.println("Corolla ligando");
    }

    @Override
    public void drive(){
        System.out.println("Você está dirigindo o Corolla");
    }

    @Override
    public void stop(){
        System.out.println("Você parou seu Corolla");
    }
}
