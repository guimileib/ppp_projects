package lab02.questao2;

public class Hilux implements IVehicle{
    @Override
    public void start(){
        System.out.println("Hilux ligando");
    }

    @Override
    public void drive(){
        System.out.println("Você está dirigindo o Hilux");
    }

    @Override
    public void stop(){
        System.out.println("Você parou seu Hilux");
    }
}
