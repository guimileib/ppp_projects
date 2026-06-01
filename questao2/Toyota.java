// SINGLETON: existe apenas uma fabricante Toyota no sistema.
// Construtor privado + getInstance() garantem a instancia unica.
public class Toyota implements IVehicleMaker {

    private static Toyota instancia;

    private Toyota() {
    }

    public static Toyota getInstance() {
        if (instancia == null) {
            instancia = new Toyota();
        }
        return instancia;
    }

    // FACTORY: traduz o nome do modelo no objeto concreto correspondente.
    @Override
    public IVehicle makeVehicle(String modelo) {
        switch (modelo.toLowerCase()) {
            case "corolla":
                return new Corolla();
            case "hilux":
                return new Hilux();
            case "etios":
                return new Etios();
            default:
                throw new IllegalArgumentException("Toyota nao fabrica: " + modelo);
        }
    }
}
