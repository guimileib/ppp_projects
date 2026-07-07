package lab02.questao2;

public class Toyota implements IVehicleMaker{
    // crio uma instancia pertencente a classe
    private static Toyota instance;

    // proibo criação de outro Honda
    private Toyota(){}

    public static Toyota getInstance(){
        if(instance == null){
            instance = new Toyota();
        }
        return instance;
    }


    // factory, concentra toda criação dos carros aqui, nada por fora
    @Override
    public IVehicle makeVehicle(String modelo){
        if (modelo.equals("Fit")){
            return new Corolla();
        } else if(modelo.equals("Civic")){
            return new Hilux();
        } else if(modelo.equals("City")){
            return new Etios();
        }
        return null;
    }

}
