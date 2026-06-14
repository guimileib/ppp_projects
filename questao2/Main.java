public class Main {

    public static void main(String[] args) {

        IVehicleMaker toyota = Toyota.getInstance();
        IVehicleMaker honda = Honda.getInstance();

        IVehicle corolla = toyota.makeVehicle("corolla");
        IVehicle hilux = toyota.makeVehicle("hilux");
        IVehicle civic = honda.makeVehicle("civic");
        IVehicle fit = honda.makeVehicle("fit");

        System.out.println("== Toyota ==");
        rodarVeiculo(corolla);
        rodarVeiculo(hilux);

        System.out.println();
        System.out.println("== Honda ==");
        rodarVeiculo(civic);
        rodarVeiculo(fit);

        System.out.println();
        System.out.println("Mesma instancia da Toyota? "
                + (Toyota.getInstance() == toyota));
    }

    private static void rodarVeiculo(IVehicle v) {
        v.start();
        v.drive();
        v.stop();
    }
}
