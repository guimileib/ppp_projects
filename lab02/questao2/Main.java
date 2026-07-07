package lab02.questao2;

public class Main {
    public static void main(String[] args) {
        // instanciando atraves da criação do carro sigleton, via getInstance
        IVehicleMaker honda = Honda.getInstance(); // se não tiver new Honda ele cria
        IVehicleMaker toyota = Toyota.getInstance();

        IVehicle corolla = toyota.makeVehicle("Corolla");
        IVehicle etios = toyota.makeVehicle("Etios");
        IVehicle hilux = toyota.makeVehicle("Hilux");

        corolla.drive();
        corolla.start();
        etios.drive();
        hilux.stop();

        IVehicle fit = honda.makeVehicle("Fit");
        IVehicle civic = honda.makeVehicle("Civic");
        
        fit.drive();
        civic.drive();
        

    }
}
