public class Main {

    public static void main(String[] args) {

        // Singleton: recupera as duas fabricantes (sempre a mesma instancia).
        IVehicleMaker toyota = Toyota.getInstance();
        IVehicleMaker honda = Honda.getInstance();

        // Factory: cada fabricante monta o veiculo a partir do nome do modelo.
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

        // Confirma que o Singleton devolve sempre o mesmo objeto.
        System.out.println();
        System.out.println("Mesma instancia da Toyota? "
                + (Toyota.getInstance() == toyota));
    }

    // Exercita o ciclo de vida do veiculo usando so a interface IVehicle.
    private static void rodarVeiculo(IVehicle v) {
        v.start();
        v.drive();
        v.stop();
    }
}
