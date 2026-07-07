package lab02.questao2;

public class Civic implements IVehicle{
    @Override
    public void start(){
        System.out.println("Você está ligando o Civic");
    }

    @Override
    public void stop(){
        System.out.println("Você parou seu Civic");
    }

    @Override
    public void drive(){
        System.out.println("Você está dirigindo seu Civic");
    }
}
