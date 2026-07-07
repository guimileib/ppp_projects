package lab02.questao2;

public class Honda implements IVehicleMaker{
    // crio uma instancia pertencente a classe
    private static Honda instance;

    // proibo criação de outro Honda
    private Honda(){}

    public static Honda getInstance(){
        if(instance == null){
            instance = new Honda();
        }
        return instance;
    }


    // factory, concentra toda criação dos carros aqui, nada por fora
    @Override
    public IVehicle makeVehicle(String modelo){
        if (modelo.equals("Fit")){
            return new Fit();
        } else if(modelo.equals("Civic")){
            return new Civic();
        } else if(modelo.equals("City")){
            return new City();
        }
        return null;
    }

}
