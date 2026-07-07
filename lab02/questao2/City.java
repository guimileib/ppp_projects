package lab02.questao2;

public class City implements IVehicle{
    @Override
    public void start(){
        System.out.println("Você está ligando o City");
    }

    @Override
    public void stop(){
        System.out.println("Você parou seu City");
    }

    @Override
    public void drive(){
        System.out.println("Você está dirigindo seu City");
    }
}
