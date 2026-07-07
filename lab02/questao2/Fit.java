package lab02.questao2;

public class Fit implements IVehicle{
    @Override
    public void start(){
        System.out.println("Você está ligando o Honda Fit");
    }

    @Override
    public void stop(){
        System.out.println("Você parou seu Honda Fit");
    }

    @Override
    public void drive(){
        System.out.println("Você está dirigindo seu Honda Fit");
    }
}
