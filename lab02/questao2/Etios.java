package lab02.questao2;
// classe dos veiculos instanciados no factory implementao os 
// metodos da interface veiculo
public class Etios implements IVehicle{
    @Override
    public void start(){
        System.out.println("Etios ligando");
    }

    @Override
    public void drive(){
        System.out.println("Você está dirigindo o Etios");
    }

    @Override
    public void stop(){
        System.out.println("Você parou seu Etios");
    }
}
