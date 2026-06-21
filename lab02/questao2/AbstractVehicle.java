public abstract class AbstractVehicle implements IVehicle {

    protected final String nome;

    protected AbstractVehicle(String nome) {
        this.nome = nome;
    }

    @Override
    public void start() {
        System.out.println(nome + ": ligando o motor.");
    }

    @Override
    public void drive() {
        System.out.println(nome + ": rodando na estrada.");
    }

    @Override
    public void stop() {
        System.out.println(nome + ": parando o veiculo.");
    }
}
